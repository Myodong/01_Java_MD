package exam.exam20220830.problem1.client.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientService {
		public void clientStart() {
			int port = 8500;
			String serverIp = "127.0.0.1";
			Socket clientSocket =null;
			BufferedReader br =null;
			PrintWriter pw = null;
			
			try {
				clientSocket = new Socket(serverIp,port);
				
				br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				pw = new PrintWriter(clientSocket.getOutputStream());
				
				String message = br.readLine();
				System.out.println(message);
				
				Scanner sc = new Scanner(System.in);
				System.out.print("입력 > ");
				pw.println(sc.nextLine());
				pw.flush();
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally { 
				try {
					if(pw != null)pw.close();
					if(br != null)br.close();
					if(clientSocket != null)clientSocket.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
}
