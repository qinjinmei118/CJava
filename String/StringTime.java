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
	System.out.println("String在循环1000次需要的时间为："+(endTime-beginTime));
	}
}
