package Session;

import java.util.Scanner;

public class StaticAndInstanceBlock {
    StaticAndInstanceBlock(){
        System.out.println("Constructor execution");
    }
    public static void main(String[] args) {
        StaticAndInstanceBlock block = new StaticAndInstanceBlock();
        block.show();//method
        Scanner sc = new Scanner(System.in);
        String s = new String("java");
    }

    static{
        System.out.println("static Block execution");//static block
    }

    void show() {
        System.out.println("method execution");
    }


    {
        System.out.println("Instance block execution");
    }

}
