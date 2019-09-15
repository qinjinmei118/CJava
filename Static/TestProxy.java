package bits.org.Static;

public class TestProxy {
	//测试静态代理
	public static void main(String[] args) {
		targetlSubject target=new targetlSubject("张三");
		Subject subject=new Proxy(target);
		subject.buy();
	}
}
