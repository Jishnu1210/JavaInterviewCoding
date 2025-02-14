package org.example;

import java.util.ArrayList;

public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String s = "Kavin Nishtha ";
        ArrayList<Character> c = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && !c.contains(s.charAt(i))) {
                    c.add(s.charAt(i));
                    System.out.print(s.charAt(i) + " ");
                    break;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Duplicate Character with Count");
        ArrayList<Character> c1 = new ArrayList<>();//hhhh
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (c1.contains(s.charAt(i))) {
                break;
            } else {
                c1.add(s.charAt(i));
                for (int j = i + 1; i < s.length()-1; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(s.charAt(i) + " " + count);
                }
//        for(int i=0;i<s.length();i++){
//            count=0;
//            if(!c1.contains(s.charAt(i))){
//                c1.add(s.charAt(i));
//                count++;
//            }
//            else{
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)) {
//                    count++;
//                }
//
//                }
//            }
//            if(c1.contains(s.charAt(i))){
//                System.out.println(s.charAt(i)+ " "+count);
//            }

            }

        }
    }
}
