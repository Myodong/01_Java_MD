package exam.exam20220901.problem1.server.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	public void serverStart() {
		int port = 8500;
		
		ServerSocket serverSocket =null;
		Socket clientSocket =null;
		
		InputStream is =null;
		OutputStream os = null;
		BufferedReader
		br = null;
		PrintWriter pw =null;
		try {
			serverSocket = new ServerSocket(port);
			
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			clientSocket = serverSocket.accept();
			
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println(clientIP + "가 연결을 요청함...");
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			
			Date now = new Date();
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			pw.println(sdf.format(now)+"[서버 접속 성공]");
			pw.flush();
			
			String message = br.readLine();
			System.out.println(clientIP+"가 보낸 메세지 : "+message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		finally { 문제 해결방법
//			try {
//				if(pw != null)pw.close();
//				if(br != null)br.close();
//				if(clientSocket != null)clientSocket.close();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
