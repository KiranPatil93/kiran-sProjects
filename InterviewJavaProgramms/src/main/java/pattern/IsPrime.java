package pattern;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if(isPrimeNumer(number)){
    System.out.println("number is prime number");
}else{
    System.out.println("number is even number");
}
    }
    public static boolean isPrimeNumer(int number){
        if(number<=1){
            return false;
        }
        for(int i=2; i<Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }

        }
        return true;
    }
}
