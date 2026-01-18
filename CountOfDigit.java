package com.prity.practicequestion;
import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		
	   int num=sc.nextInt();
	   int c=0;
	   while(num!=0) {
		   c++;
		   num=num/10;
	   }
         System.out.println("Count of digits is "+c);
         sc.close();
	}
}
