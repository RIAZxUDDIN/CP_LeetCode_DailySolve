package Day1;
import java.util.Scanner;
public class Team231A {
    public static void main(String[] args) {
        // problem: https://codeforces.com/problemset/problem/231/A
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int[] arr = new int[3];

        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 1) count1++;
            }
            if (count1 >= 2) count++;
        }

        System.out.println(count);
        sc.close();
    }

// Another way to solve without array and extra loop

//    int n = sc.nextInt(); // Number of problems
//    int count = 0; // Count of problems the team will solve
//
//        for (int i = 0; i < n; i++) {
//        int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
//        if (sum >= 2) count++;
//    }
//
//        System.out.println(count);
}
