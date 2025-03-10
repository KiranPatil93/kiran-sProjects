package Strings;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args){
      String firstName = "tom";
      String lastName = "Jerry";
      String fullName = firstName + " " + lastName;
      //  System.out.println(fullName); //tom Jerry

        //charAt
//        System.out.println(fullName.charAt(8));
//        System.out.println(fullName.length());
//
//        for(int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }
        //compareTo
        String s1 = "tom";
        String s2 = "tom";

//        if(s1.compareTo(s2)==0){
//            System.out.println("s1 and s2 are equal");
//        }else{
//            System.out.println("s1 and s2 are different");
//        }
//
//        if(new String("tony")==new String("tony")){
//            System.out.println("Strings are equesl");
//        }else{
//            System.out.println("Strings are different");
//        }
//subString()
//        String sentense = "I am writting a java programm";
//        String name = sentense.substring(16);//last index = length of this string
//        System.out.println(name);

       String str = "java";
//       String str1 = str.concat("program");
//        System.out.println(str1);

     //   System.out.println( str.replace('v','w'));

        StringBuilder sb = new StringBuilder("Java Program");
      //  System.out.println(sb);// sb - object
       // sb.insert(2,'n'); // convert object to string
        //System.out.println(sb);

      //  sb.delete(8,sb.length());
       // System.out.println(sb);

      // sb.append("ello");
       // System.out.println(sb);

//        sb.replace(0,4,"Python");
//        System.out.println(sb);

      sb.reverse();
        System.out.println(sb);





























    }



}
