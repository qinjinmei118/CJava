package bits.org.Trends;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TrendProxy implements InvocationHandler{
	private Object target;
	public Object bind(Object target) {
		this.target=target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] arg) throws Throwable {
		Object result=null;
		System.out.println("动态代理---before");
		result=method.invoke(target, arg);
		System.out.println("动态代理----fter");
		return result;
	}

}
