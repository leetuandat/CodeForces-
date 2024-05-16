package codeforces;

import java.util.Scanner;

/**
 * This class is used to solve Test problem in codeforce.
 * The link of this problem is <a href = ""> here </a>.
 *
 * @author X.e.n.g
 * @version 1.O
 * @since 19:45:52 - 2/4/2023
 */
public class Test {
    public static void main(String[] args) {
        _236A();
    }

    public static void _236A() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String readthrough = "";
        int distinct = 0;
        for (int i = 0; i < name.length(); i++) {
            if (!readthrough.contains(name.substring(i, i + 1))) {
                distinct++;
                readthrough += name.substring(i, i + 1);
            }
        }
        System.out.println(distinct % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
