package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] strings){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int s = sc.nextInt();
        int reverse=0;
        while(s != 0) {
            int remainder = s % 10;
            reverse = reverse * 10 + remainder;
            s = s / 10;
        }
        System.out.println("Reverse of the number is "+reverse);
    }
}
