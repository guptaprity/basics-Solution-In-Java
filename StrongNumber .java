package com.prity.practicequestion;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		int temp=n;
		int sum =0;
		
		while(temp!=0) {
			int ld= temp%10;
			int fact=1;
			for(int i=ld; i>=1; i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		 
		if(sum==n) {
			System.out.println("It is a strong number");
		} else {
			System.out.println("It is not a strong number");
		}
		sc.close();
	}
}
