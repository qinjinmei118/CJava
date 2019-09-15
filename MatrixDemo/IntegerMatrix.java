package bits.org.MatrixDemo;

public class IntegerMatrix extends GenericMatrix<Integer>{

	@Override
	protected Integer add(Integer element1, Integer element2) {
		return element1+element2;
	}

	@Override
	protected Integer multiply(Integer element1, Integer element2) {
		return element1*element2;
	}

	@Override
	protected Integer zero() {
		return 0;
	}

	@Override
	public void print(Integer[][] aa) {
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa.length;j++) {
				System.out.print(aa[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	@Override
	public Integer[][] addMatrix(Integer[][] matrix1, Integer[][] matrix2) {
		if(matrix1.length!=matrix2.length||matrix1[0].length!=matrix2[0].length)
		{
			throw new RuntimeException("数组行列不相等");
		}
		else {
			Integer[][] matrix3=new Integer[matrix1.length][matrix2[0].length];
			for(int i=0;i<matrix1.length;i++) {
				for(int j=0;j<matrix2[0].length;j++)
				{
					matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
			return matrix3;
		}
		
	}

	@Override
	public Integer[][] mutiplyMatrix(Integer[][] matrix1, Integer[][] matrix2) {
		//matrix1[0].length表示矩阵的第一行的列数，matrix2.length表示第二个矩阵的第一列的行数
				if(matrix1[0].length!=matrix2.length)
					return null;
				Integer[][] matrix3=new Integer[matrix1.length][matrix2[0].length];
			/*	for(int x=0;x<matrix1.length;x++)
				{
					for(int y=0;y<matrix2[0].length;y++)
					{
						matrix3[x][y]=0;
					}
				}*/
				for(int i=0;i<matrix1.length;i++)
				{
				
					for(int j=0;j<matrix2[0].length;j++) {
						matrix3[i][j]=zero();
						for(int k=0;k<matrix2.length;k++) {
							matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
						}
					}
				}
				return matrix3;
	}
	
	
}
