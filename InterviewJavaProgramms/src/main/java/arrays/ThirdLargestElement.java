package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestElement {
    public static void main(String[] args){
Integer[] a = {34,5,4,45,33,22,22,12};
        System.out.println("Third largest element"+getThirdLargest(a,8));
    }
    public static int getThirdLargest(Integer[] a,int total){
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total-3);
        return element;
    }
}
