package arrays;

public class LargestAndSmallest {
    public static void main(String[] args){
     int arr[] ={23,45,65,765,4565,334,23};
        getLargestAndSmallest(arr);
    }
    public static void getLargestAndSmallest(int arr[]){
        int largest = arr[0];
        int smallest = arr[0];
        for(int num:arr){
            if(num > largest){
                largest=num;
            }
            if(num<smallest){
                smallest = num;
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
