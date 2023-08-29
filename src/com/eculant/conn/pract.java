package com.eculant.conn;

import java.util.Scanner;

public class pract {

	public static void main(String[] args) {
		
		int a,b,c,n;
		a=0;b=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		System.out.print(a + "," + b);
		for(int i = 0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print("," + c);
		}

	}

}
