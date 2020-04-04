package com.qjm.zhongjiezhe;

public abstract class Member {
	protected AbstractChatroom chatroom;
	protected String name;
	public Member(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AbstractChatroom getChatroom() {
		return chatroom;
	}
	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}
	public abstract void sendText(String to,String message);
	public abstract void sendImage(String to,String message);
	public void receiverText(String from,String message) {
		System.out.println(from+"发送文本给"+this.name+",内容为"+message);
	}
	public void receiverImage(String from,String message) {
		System.out.println(from+"发送图片给"+this.name+",图片为"+message);
	}
}
