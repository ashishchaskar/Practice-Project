package com.facebook;

public class FibonacciDemo {
	
	// 0 1   1 2 3 5 8 13 21 34 55 89  find nth element
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		System.out.print(a + ",");
		System.out.print(b + ",");
		
		int i=1;
		int sum=0;
		while(i <= 10)
				 {
			
			sum=a+b;  //1 2 3  5  8
			System.out.print(sum + ",");  // 1 2 3 5
			a=b;      // 1  1   2   3
			b=sum;    //1   2   3   5
			i++;
		}
		
	}
	
}
