package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TestServer {

	public static void main(String[] args) {
		
		try(ServerSocket ss=new ServerSocket(5000,1);
				Scanner sc=new Scanner(System.in);) {
			System.out.println("server is waiting for client request");
			
			Thread t1=new Thread(new Runnable() {
				
				@Override
				public void run() {
					Socket ds=null;
					try {
						ds = ss.accept();
						System.out.println(ds);
						System.out.println("connection established");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					try(DataOutputStream out=new DataOutputStream(ds.getOutputStream());
							DataInputStream in=new DataInputStream(ds.getInputStream()))
					{
						//out.flush();
							//to write the data
							//showInputDialog("Enter the message to send");
						//to read the data
						while(true)
						{
							System.out.println("Client :" +in.readUTF());
						
							String msgToSend=sc.next();
							out.writeUTF(msgToSend); 
							System.out.println("Server :" + msgToSend);
						
							//System.out.println(in.readUTF());
						//out.flush();
						}
						}
					catch (Exception e) {
						// TODO: handle exception
					}
					
					}
			});
			t1.start();
			
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		}
		

	}


