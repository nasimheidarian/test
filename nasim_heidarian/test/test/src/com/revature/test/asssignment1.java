package com.revature.test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class asssignment1 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hello world"+" enter number");
		int x = sc.nextInt();
		if (x % 2 == 0 ) 
			System.out.println("the number is even");
		
		else
			System.out.println("the number is odd");
			
		
	if (x>= 3)
	{
		System.out.println("the number is grather than 3");
	
	    if (x<5)
	    	 System.out.println("the number is 4");
	     else
	    	 System.out.println("the number is grather than 5");
	}
	else
		System.out.println("the number is less than 3");
	
	System.out.println("enter float number");
	
	float y= sc.nextFloat();
	
	if (y>= 0)
	{
		System.out.println("the number is grather than 0");
	
	    if (y<5)
	    	 System.out.println("the number is less tan 5");
	     else
	    	 System.out.println("the number is grather than 5");
	}
	else
		System.out.println("the number is less than 0");
	
	
	System.out.println("even number");
	for (int i=0 ; i<=10 ;i++) {
		if (i %2 == 0)
         System.out.println(i);
	}
	
 
	System.out.println("odd number");
	int t=1;
	do{
		if(t %2 != 0)
			System.out.println(t);
		t++;
		}
	
		while(t<10);
	
	int c = 1;
	while(c < 8) {
		System.out.println("In the Loop");
		c++;
	}
	
	double a[] = {34,5.6,43,12,90.89,76.9,19.5,20,0.20,10};
	for(int m=0; m<(a.length); m++) {
		System.out.println(a[m]);
				
	}
	
	for (int i=1; i<= 10 ; i++) {
		System.out.println(i +"multiple");
		for (int j=1; j<=10;j++) {
			System.out.println(j*i);
			
		}
	}

		
	}
	

	}
	



