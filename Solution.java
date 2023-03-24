package com.ty;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner ip= new Scanner(System.in);
	Calculator cal =new CalculatorImpl();
	while(true) {
	System.out.println("options\n1.addition\n2.Subtraction\n3.multiplication\n4.division\n5.EXIT\n Enter choice:");
	int choice=ip.nextInt();
	int a=0;
	int b=0;
	
	if(choice>=1&& choice<=4) {
		System.out.println("enter the two numbers");
	 a=ip.nextInt();
	 b=ip.nextInt();
	}
	switch(choice) {
	case 1:
	System.out.println("sum of "+a +" and "+b+" is "+cal.add(a, b));
	break;
	
	case 2:
		System.out.println("difference of "+a +" and "+b+" is "+cal.add(a, b));
		break;
		
	case 3:
		System.out.println("product of "+a +" and "+b+" is "+cal.add(a, b));
		break;
		
		
	case 4:
		int res=cal.div(a, b);
		if(res!=0) {
		System.out.println("division of "+a +" and "+b+" is "+res);
		}
		else {
			System.out.println("cannot perforn division");
		}
		break;
		
	case 5:
		System.out.println("thank you");
		System.exit(0);
		break;
		
		default:System.out.println(cal.displayErrorMessege());
	}
	System.out.println("----------------");
}
}
}
 