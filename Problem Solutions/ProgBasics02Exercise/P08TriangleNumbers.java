package ProgBasics02Exercise;

import java.util.Scanner;

public class P08TriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= i ; c++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }
}
