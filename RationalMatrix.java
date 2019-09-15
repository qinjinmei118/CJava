package bits.org.MatrixDemo;

public class RationalMatrix extends GenericMatrix<Rational>{

	@Override
	protected Rational add(Rational element1, Rational element2) {
		return element1.add(element2);
		
	}

	@Override
	protected Rational multiply(Rational element1, Rational element) {
		// TODO 自动生成的方法存根
		return element1.Multiply(element);
	}

	@Override
	protected Rational zero() {
		return new Rational();
		}

	@Override
	public void print(Rational[][] aa) {
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa.length;j++) {
				System.out.print(aa[i][j].getNum()+"/"+aa[i][j].getDeno()+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	@Override
	public Rational[][] addMatrix(Rational[][] matrix1, Rational[][] matrix2) {
		if(matrix1.length!=matrix2.length||matrix1[0].length!=matrix2[0].length)
		{
			throw new RuntimeException("数组行列不相等");
		}
		else {
			Rational[][] matrix3=new Rational[matrix1.length][matrix2[0].length];
			for(int i=0;i<matrix1.length;i++) {
				for(int j=0;j<matrix2[0].length;j++)
				{
					matrix3[i][j]=add(matrix1[i][j],matrix2[i][j]);
				}
			}
			return matrix3;
		}
		
	}

	@Override
	public Rational[][] mutiplyMatrix(Rational[][] matrix1, Rational[][] matrix2) {
		if(matrix1[0].length!=matrix2.length)
			return null;
		Rational[][] matrix3=new Rational[matrix1.length][matrix2[0].length];
		for(int x=0;x<matrix1.length;x++)
		{
			for(int y=0;y<matrix2[0].length;y++)
			{
				matrix3[x][y]=zero();
			}
		}
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix2[0].length;j++) {
				
				for(int k=0;k<matrix2.length;k++) {
					matrix3[i][j]=add(matrix3[i][j],multiply(matrix1[i][k],matrix2[k][j]));
				}
			}
		}
		return matrix3;
		
	}



}
