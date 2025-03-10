package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestInteger {
    public static void main(String[] args){
        Integer[] a = {32,4,53,1,3,4,2,4};
        System.out.println("Second largest element"+getSmallestInteger(a,8));
    }
    public static int getSmallestInteger(Integer[] a,int total){
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(1);
        return element;

    }
}
