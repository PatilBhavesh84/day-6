package com.BridegeLabz.d6;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt(),a1=0,a2=1,a3,i;
		System.out.println(a1+"  "+a2);

		for(i=2;i<count;i++)
		{
			a3=a1+a2;
			System.out.println(""+a3);
			a1=a2;
			a2=a3;
		}
	}

}
