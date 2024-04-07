
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (checkString(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    //Complexity: linear - 0(N)
    private static boolean checkString(String str, int i) {

        if (i == str.length())
            return true;

        if (str.charAt(i) < '0' || str.charAt(i) > '9')
            return false;

        return checkString(str, i + 1);
    }

    public static boolean checkString(String str) {
        return checkString(str, 0);
    }
}