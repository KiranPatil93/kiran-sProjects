package Strings;

import java.util.Scanner;



public class ReverseStringChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original string");
        String str = sc.nextLine();
    String reverse ="";
    for(int i=str.length()-1;i>=0;i--){
        char charReverse = str.charAt(i);
        reverse = reverse + charReverse;
   }
        System.out.println("original string" + str);
        System.out.println(("Reverse String"+reverse));

    }
}
