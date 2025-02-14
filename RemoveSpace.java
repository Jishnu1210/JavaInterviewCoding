package org.example;

import java.util.Scanner;
/*
In this program we are finding the count of the spaces in the
sentence and printing the sentence without any spaces

e.g i/p I love India
o/p IloveIndia and Number of spaces in the sentence is 2
 */
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int count=0;
        System.out.println("String Before removing spaces is "+s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                System.out.print(s.charAt(i));
            }
            else{
                count++;
            }
        }
        System.out.println(" and Number of spaces in the sentence is "+count);
    }
}
