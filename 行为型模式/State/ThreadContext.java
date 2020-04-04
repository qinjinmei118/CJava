package com.qjm.State;

public class ThreadContext {
	//切换关系封装起来，通过使用暴露出来的方法
	private ThreadState threadState;
	public ThreadContext() {
		threadState=new NewState();
	}
	public ThreadState getThreadState() {
		return threadState;
	}
	public void setThreadState(ThreadState threadState) {
		this.threadState=threadState;
	}
	public void start() {
		((NewState)threadState).start(this);
	}
	public void getCPU() {
		((RunnableState)threadState).getCPU(this);
	}
	public void suspend() {
		((RunningState)threadState).suspend(this);
	}
	public void stop() {
		((RunningState)threadState).stop(this);
	}
	public void resume() {
		((BlockedState)threadState).resume(this);
	}
	
}
