package org.example;

import java.util.Scanner;

public class CountVowelsnConstants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int vowels=0,constant=0;
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(c=='a'  ||c=='e' ||c=='i'   ||c=='o' ||c=='u'){
                vowels++;
            }
            else if(c!=' '){
                constant++;
            }
        }
        System.out.println("Vowels count is: " +vowels+ " Constants count is: "+constant);
    }
}
