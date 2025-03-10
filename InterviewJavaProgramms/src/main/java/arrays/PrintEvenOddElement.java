package arrays;

public class PrintEvenOddElement {
    public static void main(String[] args){
        int[] a = {3,4,5,12,34,5,7,8,9,0,3,5};
        for(int n:a){
            if(n%2==0){
                System.out.println(n+"even number");
            }else{
                System.out.println(n+"odd number");
            }
        }
    }
}
