package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original string");
        String original = sc.nextLine();
        String[] word = original.split(" ");
      for(int i =word.length-1;i>=0;i--){
          System.out.println(word[i].toString());
      }
    }
}
