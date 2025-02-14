package org.example;

import java.util.Scanner;

public class ReverseEachWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        String reverse = "";
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else {
                reverse = reverse + reverse(word)+" ";
                word="";
            }
            if(i==s.length()-1){
                reverse = reverse + reverse(word);
            }

        }
        System.out.println("Reverse of each word in sentence is "+reverse);

    }
    public static String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}
