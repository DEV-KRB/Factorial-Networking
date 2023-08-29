package com.eculant.conn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		
		try {
			System.out.println("Connection Established");
			Socket soc = new Socket("localhost", 8989);
			
			//read number from keyboard
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number");
			//as inputstreamreader will give and read the string value so parse int will convert string value to integer
			int number = Integer.parseInt(br.readLine());
			PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
			pw.println(number);
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
