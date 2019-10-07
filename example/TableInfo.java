package org.ddd.annotation.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class TableInfo {

	private String tableName;  //�������
	private Class<?> clazz; //�ñ��Ӧ��ʵ��������Ϣ��
	private boolean needPersist = false; //�Ƿ���Ҫ�־û��洢
	private Map<String,ColumnInfo> columns = new HashMap<String,ColumnInfo>(); //�ñ��е������ֶ���Ϣ

	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	public Map<String, ColumnInfo> getColumns() {
		return columns;
	}
	public void setColumns(Map<String, ColumnInfo> columns) {
		this.columns = columns;
	}
	/**
	 * ���ֶ��б�������ֶ���Ϣ
	 * @param key �ֶεı�ʶ��һ�����ֶ���
	 * @param column //�ֶ���Ϣ���������ơ����͡����Ƶ�
	 */	
	public void addColumn(String key,ColumnInfo column){
		this.columns.put(key, column);
	}
	public boolean isNeedPersist() {
		return needPersist;
	}
	public void setNeedPersist(boolean needPersist) {
		this.needPersist = needPersist;
	}
	
	/**
	 * ��ʵ���Ӧ��������Ϣ��ת���ɱ���Ϣ
	 * ��ת�����̳����£�
	 * 1.����������Ϣ����ȡʵ����ļ�������Ϊ����
	 * 2.��ȡ�ڸ�����ʹ�õ�ע�⼯��
	 * 3.������Щ���ϣ�
	 * 		1.���������Щ�����к���@Entityע�⣬�������ʵ����Ҫ�־û��洢��Ȼ���ȡ@Entityע��Ĳ���value
	 * 			���������Ϊ�գ��򽫱�����Ϊ�˲���ֵ������ѭ��
	 * 		2.���û���ҵ���ע�⣬��˵����ʵ�岻��Ҫ�־û��洢���򷵻�null
	 * 4.�����ʵ����Ҫ�־û��洢���������ʵ��������Ϣ�������������������б���������ת���ɱ���ֶ���Ϣ������ӵ��ֶ���Ϣmap��
	 * 5.��󷵻ؽ����õı���Ϣʵ��
	 * @param clazz ʵ���Ӧ��������Ϣ
	 * @return ��������Ϣ��ת���ɵı���Ϣ����
	 */
	public static TableInfo parse(Class<?> clazz){
		TableInfo table = new TableInfo();
		table.clazz = clazz;
		table.tableName = table.clazz.getSimpleName();
		java.lang.annotation.Annotation[] annotations = table.clazz.getAnnotations();
		for(java.lang.annotation.Annotation annotation : annotations){
			if(annotation.annotationType().equals(Entity.class)){ //�������@Entityע�⣬�������ʵ����Ҫ�־û��洢
				table.needPersist = true; //�־û��洢��־����Ϊtrue
				Entity entity = (Entity)annotation;
				if(!entity.value().equals("")){
					table.tableName = entity.value();
				}
				break;
			}
		}
		if(table.needPersist){  //�����Ҫ�־û��洢�����������ֶ���Ϣ
			Field[] fields = table.clazz.getDeclaredFields();
			for(Field field : fields){
				ColumnInfo column = ColumnInfo.parse(field);
				if(column != null){
					table.columns.put(field.getName(), column);
				}
				
			}
			return table;
		}
		else //����Ҫ�־û��洢���򷵻�null
		{
			return null;
		}
	}
	
	/**
	 * ʹ�ñ���Ϣ��������SQL�������
	 */
	@Override
	public String toString(){
		StringBuilder sql = new StringBuilder();
		sql.append(Symbol.LINE);
		sql.append("CREATE TABLE ");
		sql.append(this.tableName + Symbol.BLANK);
		sql.append("(");
		for(ColumnInfo column : this.columns.values()){
			sql.append(Symbol.LINE);
			sql.append(Symbol.TAB);
			sql.append(column.toString());
		}
		sql.append(Symbol.LINE);
		sql.append(");");
		return sql.toString();
	}
}
