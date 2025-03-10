package Strings;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[]main){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        //String withoutSpaceString = str.replaceAll("\\s+","");
        String withoutSpaceString = str.strip();
        System.out.println(withoutSpaceString);
    }
}
