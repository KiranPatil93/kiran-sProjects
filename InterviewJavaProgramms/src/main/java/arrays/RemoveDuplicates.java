package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
int[] array = {4,54,55,5,3,9,55,9,4};

int[] result=removeDuplicates(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] removeDuplicates(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int element:arr){
       set.add(element);
        }
        //convert set into array
        int[] result = new int[set.size()];
        int index =0;
        for(int element:set){
            result[index++]=element;
        }
        return result;
    }

}
