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
		// TODO 自动生成的方法存根
		Member member=(Member)members.get(to);
		String newMessage=message;
		newMessage=message.replaceAll("打", "*");
		member.receiverText(from, message);
	}

	@Override
	public void sendImage(String from, String to,String image) {
		// TODO 自动生成的方法存根
		Member member=(Member)members.get(to);
		//模拟图片大小判断
		if(image.length()>5) {
			System.out.println("图片太大，发送失败");
		}else {
			member.receiverImage(from, image);
		}
	}

}
