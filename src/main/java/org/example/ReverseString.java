package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String s = "My name is Test";
        String r = "";
        for(int i=s.length()-1;i>=0;i--){
            r = r + s.charAt(i);
        }
        System.out.println(r);
    }
}
