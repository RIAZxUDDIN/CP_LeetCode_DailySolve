package Day2;
import java.util.Scanner;

public class BitPlusPlus282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of operations
        int x = 0;

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
        sc.close();
    }
}
