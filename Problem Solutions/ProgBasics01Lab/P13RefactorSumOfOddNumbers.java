package ProgBasics01Lab;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d%n" ,i);
                sum = sum + i;
                n++;
            }
        }
        System.out.printf("Sum: %d%n", sum);



    }
}
