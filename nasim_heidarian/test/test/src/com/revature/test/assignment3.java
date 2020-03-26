package com.revature.test;

import java.util.Scanner;

public class assignment3 {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		
		String a= "hello";
		System.out.println("whta is your name");
		String n = sc.nextLine();
		System.out.println(a + n);
		
		System.out.println("enter fist word");
		String c = "abc";//sc.nextLine();
		System.out.println("enter second word");
		String d= "ABC";//new String(sc.nextLine());
		if (c == d) {
			System.out.println("true");
			}
		else
		 {
			System.out.println("false");
			}
		System.out.println(c.equals(d));
		
		System.out.println(c.equalsIgnoreCase(d));
		
		String i= "abcdefghigklmnopqrstuvwxyz";
		System.out.println(i.indexOf("s"));
		System.out.println(i.indexOf("f"));
		
		System.out.println("write your sentence");
		String l = sc.nextLine();
		System.out.println(l.substring(l.length()-5));
		
		System.out.println(l.indexOf(" ", l.indexOf(" ")+1));
		
		System.out.println(l.indexOf("m", l.indexOf("m")+1));
		
		String p =  "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
		
		System.out.println(p.substring(p.indexOf("=")+1));
		
	}

}
