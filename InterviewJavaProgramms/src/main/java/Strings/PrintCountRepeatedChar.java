package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintCountRepeatedChar {
    public static void getRepeatedChar(String str){
char[] charArray = str.toCharArray();
        Map<Character,Integer> countCharMap = new HashMap<>();
        // Count occurrences of each character
        for(char c:charArray){
            if(countCharMap.containsKey(c)){
                countCharMap.put(c,countCharMap.get(c)+1);
            }else{
                countCharMap.put(c,1);
            }
        }
        // Print characters with count greater than 1
        System.out.println("Repeated characters in the string are:");
        for(Map.Entry<Character,Integer> entry:countCharMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());

            }
        }
    }
    public static void main(String[] args){
        String str = "Javvvva coding";
        getRepeatedChar(str);
    }
}

