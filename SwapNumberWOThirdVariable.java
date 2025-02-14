package org.example;

import java.util.Scanner;

public class SwapNumberWOThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  first number");
        int first = sc.nextInt();
        System.out.println("Enter a  Second number");
        int second = sc.nextInt();
        int temp;
        System.out.println("Before Swapping the number "+first +" "+second);
        temp=second;
        second=first;
        first=temp;
        System.out.println("After Swapping the number "+first +" "+second);
    }
}
