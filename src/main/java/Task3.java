import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findPrimeOrComposite(n));
    }
    //Complexity: linear - 0(N)
    public static String findPrimeOrComposite(int n) {
        if (n == 1) {
            return "Neither prime nor composite";
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return "Composite";
            }
            else{
                return "Prime";
            }
        }
        return null;
    }
}