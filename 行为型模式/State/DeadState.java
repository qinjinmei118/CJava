package com.qjm.State;

public class DeadState extends ThreadState{
	public DeadState() {
		state=StateSet.DEAD;
		System.out.println("����״̬");
	}
	/*public void resume(ThreadContext tc) {
		System.out.println("����resume����");
		if(state==StateSet.BLOCKED) 
			tc.setThreadState(new RunnableState());
		else
			System.out.println("��ǰ�̲߳����½�״̬");
	}*/
}
