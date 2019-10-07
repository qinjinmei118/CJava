package connectionInfo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import server.Server;

public class SocketHandle implements Runnable{
	private Socket socket;
	private ShowResult sr;
	private String name;
	ObjectOutputStream oos;
	Scanner input=new Scanner(System.in);
	public SocketHandle(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run() {
		try {
			InputStream reader=socket.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(reader);
			OutputStream os=socket.getOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(os);
			String client="<"+socket.getInetAddress().toString()+":"+socket.getPort()+">";
			while(true) {
				sr=(ShowResult)ois.readObject();
				if(sr.getState().equals("1")) {
					name=((Regisetr)(sr.getCommand())).getName();
					Server.users.put(name,oos);
					if(name.equals("")) {
						Regisetr register=new Regisetr();
						sr.setCommand(register);
						sr.setState("ok");
						oos.writeObject(sr);
					}
				}
				else if(sr.getState().equals("2")) {
					name=((Login)(sr.getCommand())).getName();
					Server.users.put(name,oos);
					if(name.equals("")) {
						Login login=new Login();
						sr.setCommand(login);
						sr.setState("ok");
						oos.writeObject(sr);
					}
				}
					else if(sr.getState().equals("3")) {
						 String toName=((Message)(sr.getCommand())).getTo();
						 String message=((Message)(sr.getCommand())).getMessage();
						 Message message2=new Message();
						 message2.setTo(toName);
						 message2.setMessage(message);
						 oos.writeObject(message2);
						 oos=Server.users.get(toName);
						 if(oos!=null) {
							 oos.writeObject(message2);
							 oos.flush();
						 }
						 else {
							 oos.writeBytes("对不起，没有此用户！请检查.......");
							 
						 }
					}
						 else if(sr.getState().equals("4")) {
							 name=((Logout)sr.getCommand()).getName();
							 Server.users.remove(name);
							 sr.setState("logout");
							 oos.writeObject(sr);
							 break;
						 }
						 else {
							 oos.writeBytes("输入有误，请重新输入");
						 }
				oos.flush();
					
			}
			ois.close();
			oos.close();
			socket.close();
		}
		 catch (IOException | ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
			
	}
	public static void FileInformation(String texts,String name) {
		JFrame showInfo=new JFrame();
		JPanel jp=new JPanel();
		JTextArea text=new JTextArea(20,20);
		text.append(texts+"\n");//输入
		jp.add(text);
		showInfo.add(jp);
		
		showInfo.setTitle("服务端响应");
		showInfo.setVisible(true);
		showInfo.setSize(300, 200);
		showInfo.setLocation(500,500);
		showInfo.setDefaultCloseOperation(1);
	}
}
