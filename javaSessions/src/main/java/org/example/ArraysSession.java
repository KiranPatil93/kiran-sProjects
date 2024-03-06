package org.example;

import java.util.Scanner;

public class ArraysSession {
    public static void main(String[] args){


  /*  int a = 10;
    int b =20;
    int c =30;


    int[] arr = new int[3];  //object
       // System.out.println(arr);
        arr[0] = 10;
        arr[1] =20;
        arr[2] =30;

        //how to find length of the array
        int length = arr.length;
       // System.out.println(length);

        //how to print elements in array

     //   System.out.println(arr[0]);
     //   System.out.println(arr[1]);
     //   System.out.println(arr[3]);

for(int i=0;i<3;i++){
    System.out.println(arr[i]);
}


int[] array = new int[]{10,20,30};
int[] ar ={10,20,30};
*/


Scanner sc =new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = sc.nextInt();
        int[] array =new int[size];
        System.out.println("user value is :"+size );
        for(int i=0;i<size;i++){
            System.out.println("enter element" );
            array[i] = sc.nextInt();
            System.out.println("user Input" +array[i]);
        }






























    }






































}
