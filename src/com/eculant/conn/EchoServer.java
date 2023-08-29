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
			
			//get the number from client
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			//to convert string value to integer
			int number = Integer.parseInt(br.readLine());
			PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
			System.out.println("Factorial of " +number + " is: " + calculateFactorial(number));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static int calculateFactorial(int number) {
		
		int fact =  1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
		
}
