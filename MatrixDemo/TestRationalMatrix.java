package bits.org.MatrixDemo;

public class TestRationalMatrix {
	public static void main(String[] args) {
		Rational[][] rational1=new Rational[2][2];
		Rational[][] rational2=new Rational[2][2];
		for(int i=0;i<rational1.length;i++)
		{
			for(int j=0;j<rational2[0].length;j++) {
				rational1[i][j]=new Rational(i+1,j+5);
				rational2[i][j]=new Rational(i+1,j+6);
			}
		}
		RationalMatrix rr=new RationalMatrix();
		rr.print(rr.addMatrix(rational1, rational2));
		rr.print(rr.mutiplyMatrix(rational1, rational2));
	}

}
