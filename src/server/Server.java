package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import connectionInfo.SocketHandle;

public class Server {
	public static HashMap<String,ObjectOutputStream> users=new HashMap<String,ObjectOutputStream>();
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000);
		while(true) {
			System.out.print("ÕýÔÚµÈ´ý....");
			Socket socket=server.accept();
			SocketHandle handle=new SocketHandle(socket);
			Thread thread=new Thread(handle);
			thread.start();
		}
	}
}
