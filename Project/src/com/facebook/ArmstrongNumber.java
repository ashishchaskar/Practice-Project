package com.facebook;

import java.util.Scanner;

public class ArmstrongNumber {
	
	//153 
	
	public static void checkArmstrong(int num) {
		
		int a=num;
		int sum=0;
		
		while(a != 0) {
			
		 int b= a%10;	//3  5   1
		 int b1=b*b*b;  //27 125 1 
		 sum=sum+b1;    //27 152 153
		 a=a/10;     //15  1  0
		 
		}
		
		if(sum == num) {
			
			System.out.println(num + " is a armstrong number ");
		
		}else {
			
			System.out.println(num + " is not a armstrong number ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a = scanner.nextInt();
		checkArmstrong(a);
		scanner.close();
		
	}
	

}
