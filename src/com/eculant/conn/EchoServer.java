package com.eculant.conn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
		try {
			System.out.println("Waiting for clients");
			ServerSocket ss = new ServerSocket(8989);
			Socket soc = ss.accept();
			System.out.println("Connection established");
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = br.readLine();
			PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);
			pw.println("Server says "+ str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
