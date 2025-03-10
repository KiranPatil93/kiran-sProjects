package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array elements in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
