package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] strings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive  number");
        int s = sc.nextInt();
        int temp=s;
        int reverse = 0;
        while(s>0) {
            int remainder = s % 10;
            reverse = reverse * 10 + remainder;
            s = s / 10;
        }
        if(reverse==temp){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}
