package bits.org.Static;

public class targetlSubject implements Subject{
	private String name;
	public targetlSubject(String name) {
		this.name=name;
	}
	//目标类
	@Override
	public void buy() {
		System.out.println(name+"买车");
		
	}
	
}
