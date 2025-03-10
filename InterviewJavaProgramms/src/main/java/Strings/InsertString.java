package Strings;

import java.util.Scanner;

public class InsertString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original String");
        String original = sc.nextLine();
        System.out.println("Enter another string");
        String insert = sc.nextLine();
        System.out.println("Enter position to enter string");
        int position = sc.nextInt();
        //validate position
        if(position==0||position>original.length()){
            System.out.println("Position is not valid");
        }else{
            StringBuilder builder = new StringBuilder(original);
          String newResult =builder.insert(position,insert).toString();
            System.out.println("Resulting string"+ newResult );
        }



    }
}
