package org.example;

import java.util.Scanner;

public class No_of_Digits_inNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count=0;
        if(number==0) {
            count = 1;
        }
        else{
                while (number > 0 || number < 0) {
                    number = number / 10;
                    count++;
                }
            }
        System.out.println("Number of digits in the given number is "+count);
    }
}
