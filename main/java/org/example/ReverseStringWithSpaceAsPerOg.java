package org.example;

import java.util.Scanner;

//input My name is Test
//output ts eTsi em anyM
//Below code is written by me
public class ReverseStringWithSpaceAsPerOg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
//        String s="My name is Test";
        String r="";
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(j)== ' '){
                r=r+ " ";
                if(s.charAt(i)!=' ') {
                    r = r + s.charAt(i);
                }
            }
            else{
                if(s.charAt(i)!=' '){
                    r=r+s.charAt(i);
                }
            }
            j++;
        }
        System.out.println(r);
    }
}

//Below code is optimized logic by chatgpt

//public class ReverseStringWithSpaceAsPerOg {
//    public static void main(String[] args) {
//        String s = "My name is Test";
//        char[] chars = s.toCharArray();
//        int left = 0, right = chars.length - 1;
//
//        while (left < right) {
//            if (chars[left] == ' ') {
//                left++;
//            } else if (chars[right] == ' ') {
//                right--;
//            } else {
//                char temp = chars[left];
//                chars[left] = chars[right];
//                chars[right] = temp;
//                left++;
//                right--;
//            }
//        }
//
//        System.out.println(new String(chars));
//    }
//}
