package bits.org.Static;

public class TestProxy {
	//���Ծ�̬����
	public static void main(String[] args) {
		targetlSubject target=new targetlSubject("����");
		Subject subject=new Proxy(target);
		subject.buy();
	}
}
