package pattern;

public class Fibonacci {
    public static void main(String[] args){
int number = 10;
        for(int i=0;i<number;i++){
            System.out.println(getFibonacci(i));
        }
    }
    public static int getFibonacci(int number){
        if(number==1||number==2){
            return 1;
        }
        int fibo1 =1;int fibo2=1;int fibonacci =1;
        for(int i=3;i<number;i++){
            fibonacci = fibo1 +fibo2;
fibo1=fibo2;
fibo2 =fibonacci;
        }
        return fibonacci;
    }
}
