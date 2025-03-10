package Strings;

public class ReverseSentense {
    public static void main(String[] args){
        String str = " this is my java program";
        String[] arr = str.split(" ");
        String result = "";
        for(int i=arr.length-1; i>=0;i--){
             result = result+arr[i]+ " ";
        }
        System.out.println(result);
    }
}
