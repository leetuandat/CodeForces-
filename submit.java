package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class submit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String encrytedString = scanner.next();
        scanner.close();

        int temp = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += encrytedString.charAt(i);
            i += temp;
            temp++;
        }
        System.out.println(ans);
    }
}
