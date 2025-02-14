package org.example;

import java.util.Scanner;
/*
This program will output the characters at even index in String

i/p : I want you
o/p :  atyu
 */
public class EvenIndexCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        StringBuilder s1=new StringBuilder();
        for (int i = 1; i < s.length(); i+=2) {
            s1.append(s.charAt(i));
            }
        System.out.println(s1);
        }

    }
