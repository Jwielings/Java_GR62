package Chapter5;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);

    }
}

// god wat was het uitdagend om recursie te snappen, maar ik heb hem nu.. denk ik lol