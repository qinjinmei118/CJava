package bits.org.Static;

public class Proxy implements Subject{
	//������
	private targetlSubject targetSubject;
	public Proxy(targetlSubject targetSubject) {
		this.targetSubject=targetSubject;
	}
	@Override
	public void buy() {
		System.out.println("��̬����-----Before");
		try {
			targetSubject.buy();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("��̬����------After");
			System.out.println();
		}
		
	}

}
