package bits.org.MatrixDemo;

public class Rational extends Number{
	private long num=0;//分子
	private long deno=0;//分母
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public long getDeno() {
		return deno;
	}
	public void setDeno(long deno) {
		this.deno = deno;
	}
	public Rational() {
		this(0,1);
	}
	//化简分数
	public Rational(long num1,long deno1) {
		long commentNum=commentNum(num1,deno1);
		this.num=((deno>0)?1:-1)*num1/commentNum;
		this.deno=Math.abs(deno1)/commentNum;
	}
	//求公约数
	private long commentNum(long a,long b) {
		long a1=Math.abs(a);
		long b1=Math.abs(b);
		int commentN=1;//设置公约树为1
		for(int i=1;i<=a1&&i<=b1;i++) {
			if(a1%i==0&&b1%i==0) {
				commentN=i;
			}
		}
		return commentN;
	}
	public Rational add(Rational second) {
		long nn=num*second.getDeno();
		long dd=deno*second.getDeno();
		return new Rational(nn,dd);
	}
	public Rational Multiply(Rational second) {
		long nn=num*second.getNum();
		long dd=deno*second.getDeno();
		return new Rational(nn,dd);
	}
	
	@Override
	public double doubleValue() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int intValue() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public long longValue() {
		// TODO 自动生成的方法存根
		return 0;
	}
	
}
