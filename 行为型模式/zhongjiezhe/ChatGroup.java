package com.qjm.zhongjiezhe;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom{
	private Hashtable members=new Hashtable();
	@Override
	public void register(Member menber) {
		if(!members.contains(menber)) {
			members.put(menber.getName(),menber);
			menber.setChatroom(this);
		}
	}

	@Override
	public void sendText(String from, String to,String message) {
		// TODO �Զ����ɵķ������
		Member member=(Member)members.get(to);
		String newMessage=message;
		newMessage=message.replaceAll("��", "*");
		member.receiverText(from, message);
	}

	@Override
	public void sendImage(String from, String to,String image) {
		// TODO �Զ����ɵķ������
		Member member=(Member)members.get(to);
		//ģ��ͼƬ��С�ж�
		if(image.length()>5) {
			System.out.println("ͼƬ̫�󣬷���ʧ��");
		}else {
			member.receiverImage(from, image);
		}
	}

}
