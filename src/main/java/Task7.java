import java.util.Scanner;

public class Task7{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        permutation(str);
    }
    //Complexity: constant - 0(1)
    public static String swap(String str, int i, int j) {

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(i, str.charAt(j));
        stringBuilder.setCharAt(j, str.charAt(i));
        return stringBuilder.toString();
    }
    //Complexity: linear - 0(N)
    private static void permutation(String str, int i) {

        if (i == str.length()) {
            System.out.println(str);
            return;
        }

        for (int j = i; j < str.length(); j++) {
            str = swap(str, i, j);
            permutation(str, i + 1);
            str = swap(str, i, j);
        }
    }

    public static void permutation(String str) {
        permutation(str, 0);
    }

}