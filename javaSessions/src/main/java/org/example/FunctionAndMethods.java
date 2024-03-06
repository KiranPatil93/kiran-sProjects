package org.example;

import java.util.Scanner;

public class FunctionAndMethods {

    //factorial


    public static void printFactorial(int n) {

        if (n<0) {
            System.out.println("Invalid number");
        }
            int factorial = 1;
            for (int i=n; i>=1; i--) {
                factorial = factorial * i;
            }
            System.out.println(factorial);

    }
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        printFactorial(n);























    //   int sum = calculateSum(a,b);
      // System.out.println(sum);



























//function is the block code

   /*   public static  retunType functionName(type arg1, type arg2,..){
            //operations
            return type
        }

*/

     /*   public static void printMyName(String name){
            System.out.println(name);
            // System.out.println(age);

        }
*/

        /* public static int calculateSum(int a, int b){
            int sum = a+b;
            return sum;
        }

*/






    }


















































}
