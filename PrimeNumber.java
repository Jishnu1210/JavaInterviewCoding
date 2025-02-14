package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        boolean flag=true;
        for(int j=2;j<i/2;j++){
            if(i%j==0){
               flag=false;
            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
