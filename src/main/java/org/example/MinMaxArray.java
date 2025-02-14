package org.example;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int s = sc.nextInt();
        int[] a = new int[s];
        System.out.println("Enter the elements");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max=0,min=a[0];
        for(int i=0;i<s;i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if(a[i]<min){
             min = a[i];
             }
        }
        System.out.println("Maximum number in Array is "+max);
        System.out.println("Minimum number in Array is "+min);
    }
}
