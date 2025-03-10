package arrays;

import java.util.*;

public class removeDuplicateElements {
    public static void main(String[] args){
      int [] arr ={4,56,66,78,66,56};
        removeDuplicateElements(arr);

    }
    public static void removeDuplicateElements(int arr[]){
        // Convert array to a HashSet to remove duplicates
        Set<Integer> set = new LinkedHashSet();
       for(int num:arr){
           set.add(num);
       }
        // Convert HashSet back to an array
        int[] result = new int[set.size()];
       int index =0;
       for(int num:set){
           result[index] = num;
           index ++;
       }
        // Print the result
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
