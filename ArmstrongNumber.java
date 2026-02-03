package com.prity.practicequestion;
import java.util.Scanner;
 
public class ArmstrongNumber{

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int c = 0;
        int sum = 0;
        
        // Count digits
        while(temp != 0) {
            c++;
            temp /= 10;
        } 
        
        temp = n;
        // Calculate sum of powers
        while(temp > 0) {
            int digit = temp % 10;
            
            int p = 1;
            for(int i = 1; i <= c; i++) {
                p = p * digit;
            }
            
            sum = sum + p;
            temp = temp / 10;
        }
        
        if(sum == n) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        
        sc.close();
    }     
}
