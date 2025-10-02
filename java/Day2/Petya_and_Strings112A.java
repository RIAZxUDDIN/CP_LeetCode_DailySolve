package Day2;
import java.util.Scanner;

public class Petya_and_Strings112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // Convert both strings to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Compare lexicographically
        if (s1.equals(s2)) System.out.println(0);
        else if (s1.compareTo(s2) > 0) System.out.println(1);
        else System.out.println(-1);
        sc.close();
    }
}
