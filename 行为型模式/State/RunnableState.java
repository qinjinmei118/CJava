package com.qjm.State;

public class RunnableState extends ThreadState{
	public RunnableState() {
		state=StateSet.RANNABLE;
		System.out.println("����״̬");
	}
	public void getCPU(ThreadContext tc) {
		System.out.println("���CPUʱ��");
		if(state==StateSet.RANNABLE)
			tc.setThreadState(new RunningState());
		else
			System.out.println("��ǰ״̬���Ǿ���״̬");
	}
}
