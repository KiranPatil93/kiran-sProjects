package numeric;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        int factorial =getFactorial(number);
        System.out.println(factorial);
    }
    public static int getFactorial(int number){
        if(number ==0){
            return 1;
        }else{
            return number*getFactorial(number-1);
        }
    }
}
