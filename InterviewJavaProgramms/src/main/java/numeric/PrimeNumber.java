package numeric;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+  "is prime number");
        }else{
            System.out.println(n+   "is not prime number");
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;n<Math.sqrt(n);i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }
}
