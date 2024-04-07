
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }
    //Complexity: exponential - 0(2^N)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n)
            return 1;

        return binomialCoefficient(n - 1, k -1) + binomialCoefficient(n -1, k);
    }
}