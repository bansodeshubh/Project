package com.shubham.java;

import java.util.Scanner;

public class SwichStatement {
	
	public static void main(String[] args) {
    
		System.out.print("enter your day=");
		
		
		
     Scanner sc = new Scanner(System.in);
    /* String s = sc.nextLine();
     char g = sc.next().charAt(0);
     
     float ys = sc.nextFloat();
     
	long lg = sc.nextLong();
	double db = sc.nextDouble();
	short sh= sc.nextShort();
	byte bt = sc.nextByte();
     //int day =60;*/
		
     int day = sc.nextInt();
	     switch (day) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;	
			
		default:
			System.out.println("Invalid day");
			break;
			
		case 3:		
			System.out.println("Wedesnday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
		
		}
	
	}
}


