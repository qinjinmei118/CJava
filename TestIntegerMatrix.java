package bits.org.MatrixDemo;



public class TestIntegerMatrix {
	public static void main(String[] args)
	{
		//�����ʼ��
		Integer i1[][]= {
				{1,3,4},{2,4,6},{1,2,3}
		};
		Integer i2[][]= {
				{3,4,2},{5,6,3},{2,2,4}
		};
		IntegerMatrix ii=new IntegerMatrix();
		System.out.println("Ԫ�ؼӷ������");
		System.out.println(ii.add(3, 3));
		System.out.println("Ԫ�س˷������");
		System.out.println(ii.multiply(3, 3));
		System.out.println("����ӷ������");
		ii.print(ii.addMatrix(i1, i2));
		System.out.println("����˷������");
		ii.print(ii.mutiplyMatrix(i1, i2));
	}
}
