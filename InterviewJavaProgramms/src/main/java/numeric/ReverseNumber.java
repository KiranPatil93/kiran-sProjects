package numeric;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int number = sc.nextInt();
        String numberString = Integer.toString(number);
        String reverseNumberString = new StringBuilder(numberString).reverse().toString();
        int reverseNumber = Integer.parseInt(reverseNumberString);
        System.out.println("Reverse number"+reverseNumber);


    }
}
