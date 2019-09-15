package bits.org.Static;

public class Proxy implements Subject{
	//代理类
	private targetlSubject targetSubject;
	public Proxy(targetlSubject targetSubject) {
		this.targetSubject=targetSubject;
	}
	@Override
	public void buy() {
		System.out.println("静态代理-----Before");
		try {
			targetSubject.buy();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("静态代理------After");
			System.out.println();
		}
		
	}

}
