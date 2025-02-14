package org.example;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int total=0,s,temp=number;
        while(temp>0){
            s=temp%10;
            total=s*s*s+total;
            temp=temp/10;
        }
        if (total==number){
            System.out.println("Armstrong number" );
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
