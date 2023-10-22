// Create a method that will return a sequence of numbers that starts with 0 & 1
//Each number will then be the sum of the previous two numbers
// Use recursion and memoization to establish a base case & increase the execution speed of the method
//Allow for user input to retrieve (n) number in the sequence
import java.util.Scanner;

public class FibonacciSeries {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner fibNum = new Scanner(System.in);
        int numPlace;

        System.out.println("Please enter the length of the sequence:");
        numPlace = fibNum.nextInt();

        int n = numPlace;

        fibonacciCache = new long[n + 1];

        System.out.println(("The Fibonacci Sequence calculated ") + fibonacci(n) + (" as your answer!"));
        }
    private static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long nthFibonacciNum = (fibonacci(n-1) + fibonacci(n-2));

        fibonacciCache[n] = nthFibonacciNum;

        return(fibonacci(n-1) + fibonacci(n-2));
    }
}
