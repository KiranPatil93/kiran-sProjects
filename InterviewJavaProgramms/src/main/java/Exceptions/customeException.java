package Exceptions;

import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class customeException {
    public static void checkAge(int age) throws  InvalidAgeException{
   if (age< 18){
       throw new InvalidAgeException("Age must be greater than 18");
   }else{
       System.out.println("Valid age");
   }

    }
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter age");
            int age = sc.nextInt();
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println("Caught Exception" + e.getMessage());
        }
    }
}
