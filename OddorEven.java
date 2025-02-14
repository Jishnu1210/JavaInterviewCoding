package org.example;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int s=sc.nextInt();
        if(s%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
