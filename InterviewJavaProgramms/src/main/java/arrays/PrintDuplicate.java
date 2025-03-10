package arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        getDuplicate(arr);
    }
    public static void getDuplicate(int arr[]){
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int element:arr){
            if(set.contains(element)){
                duplicates.add(element);
            }else{
                set.add(element);
            }
        }
        System.out.println("Duplicate elements in the array:");
        for(int duplicate:duplicates){
            System.out.println(duplicate+ "");
        }
    }

}
