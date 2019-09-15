package bits.org.Trends;

import bits.org.Static.Subject;
import bits.org.Static.targetlSubject;

public class TestProxy {
	public static void main(String[] agrs) {
		TrendProxy trendProxy=new TrendProxy();
		Subject subject=(Subject)trendProxy.bind(new targetlSubject("уехЩ"));
		System.out.print(subject.getClass().getName());
		System.out.println();
		subject.buy();
		
	}

}
