package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class UsernameValidator {
    public static boolean  isValidUsername(String username){

        return username.matches("^[a-zA-z0-9]+$");
    }
    public static void main(String[] args){
        HashSet<String> username = new HashSet<String>();
      Scanner sc = new Scanner(System.in);
      String input;
        System.out.println("Enter student usernames (type 'exit' to stop):");
        while(true){
            System.out.println("Enter username");
            input = sc.nextLine().trim();
            if(input.contains("exit")){
                break;
            }
            if(!isValidUsername(input)){
                System.out.println("Invalid username: Username must be alphanumeric without spaces or special characters.");
            }
            else if(username.contains(input)){
                System.out.println("Invalid username:username is duplicate");
            }
            else{
                username.add(input);
                System.out.println("valid username");
            }
        }
        sc.close();
        System.out.println("print all username");
        for(String user:username){
            System.out.println(user);
        }
    }
}
