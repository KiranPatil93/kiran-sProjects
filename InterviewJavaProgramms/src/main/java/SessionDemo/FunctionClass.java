package SessionDemo;

import java.util.Scanner;

public class FunctionClass {
    public static void printMyName(String name) {
        System.out.println(name);
    }
public static int multiplication(int a, int b){
        int c = a*b;
    System.out.println(c);
    return c;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
     int a = sc.nextInt();
        System.out.println("Enter second integer");
        int b = sc.nextInt();
        System.out.println("Multiplication is");
        multiplication(a,b);
    }
}
