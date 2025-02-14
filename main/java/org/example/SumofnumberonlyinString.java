package org.example;

import java.lang.annotation.IncompleteAnnotationException;
import java.util.Scanner;
//IncompleteAnnotationException
public class SumofnumberonlyinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))>0 ||Integer.parseInt(String.valueOf(s.charAt(i)))<9){
               sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Sum of integers in String is "+sum);
    }
}
