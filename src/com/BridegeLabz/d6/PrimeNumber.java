package com.BridegeLabz.d6;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(n%2!=0) {
			System.out.println(n+ "-is prime");
		}else
			System.out.println(n+"-is not prime");
	}
}

