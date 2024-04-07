import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }
    //Complexity: linear - 0(N)
    public static int findFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return findFactorial(n-1)*n;
    }
}