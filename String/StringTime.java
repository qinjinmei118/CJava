package bits.org.String;

public class StringTime {
	public static void main(String[] args) {
	String str="qjm";
	long beginTime=System.currentTimeMillis();
	for(int i=0;i<1000;i++)
	{
		str=str+i;
	}
	long endTime=System.currentTimeMillis();
	System.out.println("String��ѭ��1000����Ҫ��ʱ��Ϊ��"+(endTime-beginTime));
	}
}
