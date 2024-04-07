import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFibonacciElement(n));
    }
    //Complexity: exponential - 0(2^N)
    public static int findFibonacciElement(int n){
        if (n <= 1) {
            return n;
        }
        return findFibonacciElement(n - 1) + findFibonacciElement(n - 2);
    }
}