package org.example;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String");
        String s2 = sc.nextLine();
        if(Anagrams.checkAnagrams(s1,s2)){
            System.out.println("Strings are Anagrams");
        }
        else{
            System.out.println("Strings are not Anagrams");
        }
    }
    public static  boolean checkAnagrams(String s1,String s2){
        int[] charcount = new int[256];
        boolean b=true;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                charcount[s1.charAt(i)]++;
                charcount[s2.charAt(i)]--;
            }
            for(int count:charcount){
                if(count!=0){
                    b= false;
                }
                else{
                   b= true;
                }
            }

        }
        else{
            b= false;
        }
        return b;
    }
}
