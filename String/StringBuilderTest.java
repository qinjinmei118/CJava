package bits.org.String;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("qjm");
		long beginTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			builder.append(i);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("StringBuilder��10000��ѭ��ִ��ʱ��Ϊ��"+(endTime-beginTime));
		}
}
