package Strings;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        System.out.println(original);
        int size = original.length();
        String reverseString = "";
        for(int i=size-1;i>=0;i--){
            char reverse = original.charAt(i);
            reverseString = reverseString +reverse;
        }
        if(original==reverseString){
            System.out.println("Given string is palindrom");
        }else{
            System.out.println("Given string is not palindrom");
        }
    }
}
