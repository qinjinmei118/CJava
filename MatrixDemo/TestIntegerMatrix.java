package bits.org.MatrixDemo;



public class TestIntegerMatrix {
	public static void main(String[] args)
	{
		//数组初始化
		Integer i1[][]= {
				{1,3,4},{2,4,6},{1,2,3}
		};
		Integer i2[][]= {
				{3,4,2},{5,6,3},{2,2,4}
		};
		IntegerMatrix ii=new IntegerMatrix();
		System.out.println("元素加法输出：");
		System.out.println(ii.add(3, 3));
		System.out.println("元素乘法输出：");
		System.out.println(ii.multiply(3, 3));
		System.out.println("矩阵加法输出：");
		ii.print(ii.addMatrix(i1, i2));
		System.out.println("矩阵乘法输出：");
		ii.print(ii.mutiplyMatrix(i1, i2));
	}
}
