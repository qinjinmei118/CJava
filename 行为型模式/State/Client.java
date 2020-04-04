package com.qjm.State;

public class Client {
	public static void main(String args[]) {
		ThreadContext context=new ThreadContext();
		context.start();
		context.getCPU();
		context.suspend();
		context.resume();
		context.getCPU();
		context.stop();
	}
}
