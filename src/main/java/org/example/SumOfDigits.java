package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = sc.nextInt();
        int temp=0;
        while(number>0){
            int s=number%10;
            temp=temp+s;
            number=number/10;
        }
        System.out.println("Sum of digits is "+temp);
    }

}
