package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SoartArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] =  new int[size];
        for(int i =0;i<size;i++){
            System.out.println(i+"th array element");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
//        for(int j=0;j<size;j++){
//            System.out.println(array[j]);
//        };
        for(int j=array.length-1;j>0;j--){
            System.out.println(array[j]);
        }
    }


}
