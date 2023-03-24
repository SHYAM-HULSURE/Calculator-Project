package com.ty;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		while(true) {
			System.out.println("enter the choice");
			int choice =ip.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hi tom");
				break;
				
			case 2:
				System.out.println("hi jerry");
				break;
				
			case 3:
				System.out.println("thank you");
				System.exit(0);
				default:
					System.out.println("bye");
			}
			System.out.println("-----");
		}
	}

}
