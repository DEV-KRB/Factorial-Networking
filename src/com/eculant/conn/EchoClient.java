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
			
			//ask user to enter the string and send that string to server
			//server will read thatstring and send it back
			//InputStreamsReader is used to read the data
			//to read data string from the keyboard BufferedReader is used
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string");
			//read line is the mth which will wait for the user to enter the string and once
			//entered it will return that string and capture in object
			String str = br.readLine();
			//true is for auto flush data
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(str);
			
			// it will read data server has sent and print it
			BufferedReader br2 = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(br2.readLine());
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
