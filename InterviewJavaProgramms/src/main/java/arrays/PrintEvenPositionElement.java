package arrays;

import java.util.Scanner;

public class PrintEvenPositionElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //print even position element
        for(int i=1;i<arr.length;i+=2){
            System.out.println(arr[i]+ " ");
        }
        //print odd position elements
        for(int i=0;i<arr.length;i+=2){
            System.out.println(arr[i]+ " ");
        }
        //sum of each element in array
        int sum=0;
        for(int num:arr){
            sum +=num;
        }
        System.out.println(sum);
    }
}
