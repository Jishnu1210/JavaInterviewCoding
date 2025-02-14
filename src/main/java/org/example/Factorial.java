package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int j = sc.nextInt();
        int sum=1;
        for(int i=2;i<=j;i++){
          sum=sum*i;
        }
        System.out.println("Factorial of "+j+" is "+sum);
    }
}
