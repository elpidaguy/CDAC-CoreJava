package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Host and Port");
			@SuppressWarnings("resource")
			Socket ss = new Socket("40.30.0.116", 5000);
			System.out.println("Connection Established");
			try( DataOutputStream out = new DataOutputStream(ss.getOutputStream());
					
					) {
				DataInputStream in = new DataInputStream(ss.getInputStream());
				//out.flush();
				while(true) {
					String msg = sc.next();
					//String msg=JOptionPane.showInputDialog("Enter mesg to send");
					out.writeUTF(msg);
					System.out.println("Kaustubh: "+msg);
					if(in.available()>0)
						System.out.println("Poonam Server: "+in.readUTF());
					//out.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
