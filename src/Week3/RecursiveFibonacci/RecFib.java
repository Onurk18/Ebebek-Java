package Week3.RecursiveFibonacci;

public class RecFib {
    static int fib(int x){
        return x<=1? x: fib(x-1)+fib(x-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}

