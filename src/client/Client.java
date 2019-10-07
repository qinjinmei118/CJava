package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import connectionInfo.CommandDate;
import connectionInfo.Login;
import connectionInfo.Logout;
import connectionInfo.Message;
import connectionInfo.Regisetr;
import connectionInfo.ShowResult;

public class Client {
	private static CommandDate cc;
	private static ShowResult ss;
	public static void main(String[] args) throws Exception, Exception {
		Socket socket = new Socket("127.0.0.1",8000);
		OutputStream os=socket.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		InputStream reader=socket.getInputStream();
		ObjectInputStream ois=new ObjectInputStream(reader);
		Scanner input=new Scanner(System.in);
		String fromName=null;//���ͷ�������
		String toName=null;//���շ�����
		int temp=0;//���ڶ�λ�Ƿ��Ѿ�������
		int i=0;//ѡ�������ֵ
		int logout=0;//�ж��Ƿ��˳�
		System.out.print("��ѡ��1.ע��  2.��¼  3.����Ϣ  4.�˳�");
		while(true) {
			i=input.nextInt();
			if(i==1) {
				System.out.print("������");
				fromName=input.next();
				Regisetr register=new Regisetr();
				register.setName(fromName);
				register.setSendDate(new Date());
				ShowResult result=new ShowResult(register,"1");
				oos.writeObject(result);
				ss=(ShowResult)ois.readObject();
				System.out.println("��������Ӧ��"+ss.getCommand()+"state="+ss.getState());
			}
			else if(i==2) {
				System.out.print("������");
				fromName=input.next();
				Login login=new Login();
				login.setName(fromName);
				ShowResult result=new ShowResult(login,"2");
				oos.writeObject(result);
				ss=(ShowResult)ois.readObject();
				System.out.println("��������Ӧ��"+ss.getCommand()+"state="+ss.getState());
			}
			else if(i==3) {
				System.out.print("���շ�������");
				toName=input.next();
				System.out.print("��("+fromName+")˵��");
				String message=input.next();
				Message me=new Message();
				me.setForm(fromName);
				me.setTo(toName);
				me.setMessage(message);
				temp=1;
				if(message.equals("logout")) {
					logout=1;
				}
				else {
					ShowResult result=new ShowResult(me,"3");
					oos.writeObject(result);
					//������Ϣ
					Message m=(Message)ois.readObject();
					String str="�Ҷ�"+toName+"˵��"+m.getMessage();
					System.out.print(str);
					FileInformation(str,"��");
				}
			}
			if(i==4||logout==1) {
				Logout logout2=new Logout();
				logout2.setName(fromName);
				ShowResult result=new ShowResult(logout2,"4");
				oos.writeObject(result);
				ss=(ShowResult)ois.readObject();
				System.out.println("��������Ӧ��"+ss.getCommand()+"state="+ss.getState());
				break;
			}
		}
		ois.close();
		oos.close();
		socket.close();
		
	}
	public static void FileInformation(String texts,String name) {
		JFrame showInfo=new JFrame();
		JPanel jp=new JPanel();
		JTextArea text=new JTextArea(20,20);
		text.append(texts+"\n");//����
		jp.add(text);
		showInfo.add(jp);
		
		showInfo.setTitle(name+"�ش�");
		showInfo.setVisible(true);
		showInfo.setLocation(500,500);
		showInfo.setDefaultCloseOperation(1);
	}
}
