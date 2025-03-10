package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array");
for(int i=0;i<arr.length;i++){
    arr[i] = sc.nextInt();
}
        getFrequency(arr);
    }
    public static void getFrequency(int[] arr){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int n:arr){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }
        System.out.println("Print frequency of each element");
        for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            System.out.println(entry.getKey()+ "appears" + entry.getValue() + "times");
        }
    }
}
