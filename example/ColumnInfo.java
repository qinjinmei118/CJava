package org.ddd.annotation.example;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;



public class ColumnInfo {
	private String columnName; //�ֶ�����
	private Class<?> type; //�ֶ�����
	private boolean isID = false; //�Ƿ�������
	private boolean nullable = true; //�Ƿ����Ϊ��
	private int length = 32; //�ֶγ���
	private boolean needPersist = false;  //���ֶ��Ƿ���Ҫ���浽���ݿ���
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public boolean isID() {
		return isID;
	}
	public void setID(boolean isID) {
		this.isID = isID;
	}
	public boolean isNullable() {
		return nullable;
	}
	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public boolean isNeedPersist() {
		return needPersist;
	}
	public void setNeedPersist(boolean needPersist) {
		this.needPersist = needPersist;
	}
	
	/**
	 * ����������������Field�������ֶ���Ϣ
	 * ��������������£�
	 * 1.��ȡField��������ƣ���Ϊ�ֶ�����
	 * 2.��ȡField��������ͣ���Ϊ�ֶε�����
	 * 3.��ȡ��������������ע�⼯�ϣ���������Щע��
	 * 4.���ע����@Column,�����������Ӧӳ������ݿ��е��ֶ�
	 * 5.���ע����@ID���������������Ϊ���ݿ��б������
	 * 6.����жϸ������Ƿ���Ҫ�־û�������Ҫ���ؽ�������ֶ���Ϣ���󣬷��򷵻�null
	 * @param field
	 * @return
	 */
	public static ColumnInfo parse(Field field){
		ColumnInfo column = new ColumnInfo();
		column.columnName = field.getName();
		column.type = field.getType();
		Annotation[] annotations = field.getAnnotations();
		for(Annotation annotation : annotations){
			if(annotation.annotationType().equals(Column.class)){ //���ע����@Column
				column.needPersist = true; //���ó���Ҫ�־û��洢
				Column columnAnno = (Column)annotation; 
				if(!columnAnno.value().equals("")){ //��value��Ϊ�գ����ֶ������ó�Ϊע��value�Ĳ���ֵ
					column.columnName = columnAnno.value();
				}
				column.nullable = columnAnno.nullable();
				if(columnAnno.length() != -1){ //��length��Ϊ�գ��������ֶεĳ���ֵ
					column.length = columnAnno.length();
				}
			}else if(annotation.annotationType().equals(ID.class)){
				column.needPersist = true;
				ID id = (ID)annotation;
				column.isID = true;
				if(!id.value().equals("")){ //����û�������valueֵ������valueֵ��Ϊ�ֶ���
					column.columnName = id.value();
				}
			}
		}
		if(column.needPersist){
			return column;
		}else{
			return null;
		}
	}
	
	
	/**
	 * �����sql�ַ���
	 */
	@Override
	public String toString(){
		StringBuilder sql = new StringBuilder(columnName);
		
		if(this.type.equals(String.class)){
			sql.append(Symbol.BLANK + "VARCHAR(" + this.length + ")");	
		}else if(this.type.equals(Integer.class)){
			sql.append(Symbol.BLANK + "INT");
		}
		
		if(this.isID){
			sql.append(Symbol.BLANK + "PRIMARY KEY");
		}
		if(!this.isNullable()){
			sql.append(Symbol.BLANK + "NOT NULL");
		}
		sql.append(";");
		return sql.toString();
	}	
}
