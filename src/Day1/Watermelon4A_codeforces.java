package Day1;

import java.util.Scanner;

public class Watermelon4A_codeforces {
    public static void main(String[] args) {
        //problem: https://codeforces.com/problemset/problem/4/A
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2==0 && n>2) System.out.println("YES");
        else System.out.println("NO");
    }
}
