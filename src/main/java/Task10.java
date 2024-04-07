
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }
    //Complexity: logarithmic - 0(log(N))
    public static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}