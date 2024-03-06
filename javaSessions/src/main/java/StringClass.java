public class StringClass {
    public static void main(String[] args){
        //String


 /*     String s = "java";//object > string const pool

       String st = new String("java");
       st.concat("language");
       System.out.println(st);

       StringBuffer bs = new StringBuffer("java");
       bs.append("language");
        System.out.println(bs);

        //StringBuilder  >>mutable in nature , no thread saft

        String s1 = new String("kiran");// heap    constant pool
        String s2 = new String ("kiran");//heap
        String s3 = "kiran";       //
        String s4 = "Kiran";      //
*/
        //IsEmpty
   /*     String s5 = "Kiran";
        System.out.println(s5.isEmpty());//boolean value
        System.out.println(s5.length());//number of char
        //replace
        s5.replace('a','n');
        System.out.println(s5.replace('a','n'));

        //Substing(int begin)
        System.out.println(s5.substring(2));
       */
        //Reverse String
        String str = "java language";//
        int size = str.length();
        String reverse = "";

        for(int i=size-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Original String - " + str);

        System.out.println("Reverse  String - " + reverse);











        //1. What is the difference between string, stringBuffer and StringBuilder
        //1. What is the String constant pool










































    }





































}
