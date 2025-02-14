package org.example;

import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int s = sc.nextInt();
        int first = 0,value=0,second=1;
        for(int i=0;i<s;i++){
            value=value+first;
            first=second;
            second=value;
            System.out.print(value);
        }

    }
}
