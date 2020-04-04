package com.qjm.zhongjiezhe;

public class Client {
	public static void main(String args[]) {
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamondMember("张三");
		member2=new DiamondMember("李四");
		member3=new CommonMember("王二");
		member4=new CommonMember("小五");
		member5=new CommonMember("小明");
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);
		member1.sendText("李四", "你好");
		member2.sendText("张三", "你好");
		member1.sendText("李四", "天气不错");
		member2.sendImage("张三", "大大大大大大大的太阳");
		member2.sendImage("张三", "太阳花");
		member3.sendText("小明", "还有问题吗？");
		member3.sendText("王二", "还有问题吗？");
		member4.sendText("小五", "没有了，谢谢");
		member5.sendText("小五", "没有了");
		member5.sendImage("小五", "谢谢");
	}
}
