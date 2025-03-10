package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //Ascending order
        Arrays.sort(arr);
        for(int num:arr){
            System.out.println(num);
        }


    }
}
