import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findAPowN(a,n));
    }
    //Complexity: linear - 0(N)
    public static int findAPowN(int a, int n){
        int result = 1;
        for(int i = 0; i<n; i++) {
            result *= a;
        }
        return result;
    }
}