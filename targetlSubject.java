package bits.org.Static;

public class targetlSubject implements Subject{
	private String name;
	public targetlSubject(String name) {
		this.name=name;
	}
	//Ŀ����
	@Override
	public void buy() {
		System.out.println(name+"��");
		
	}
	
}
