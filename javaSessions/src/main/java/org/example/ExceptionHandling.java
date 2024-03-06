package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
 public static void main(String[] args) {


  int a =10;
  int b =20;
  int c=30;
  //Declaration and initialize of the Array
  int[] arr =new int[3];
 // int arr[];
  //int []arr;

 // System.out.println(arr);
  arr[0]= 10;
  arr[1] =20;
  arr[2] =30;

  //System.out.println(arr[0]);

 // System.out.println(arr[1]);
 // System.out.println(arr[1]);

  /*for(int i=0;i<3;i++){
   System.out.println(arr[i]);
  }
*/
  int[] array = new int[]{10,20,30};
  int [] ar = {10,20,30};






  //Search value in Array

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your size of the array");
  int size = sc.nextInt();
  System.out.println("Provided size is  :" +size);
  for(int j=0; j<size; j++){
   System.out.println("user input :"+j);
   int number = sc.nextInt();
   System.out.println("user provided elements :" +number);
  }



















 }
}
