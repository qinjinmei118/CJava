package com.qjm.State;


//�½�һ���߳�
public class NewState extends ThreadState{
	public NewState() {
		state=StateSet.NEW;
		System.out.println("�½��߳�");
	}
	public void start(ThreadContext tc) {
		System.out.println("������start����");
		if(state==StateSet.NEW) 
			tc.setThreadState(new RunnableState());
		else
			System.out.println("��ǰ�̲߳������½�״̬");
		
	}
}
