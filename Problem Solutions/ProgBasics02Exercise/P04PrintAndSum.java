package ProgBasics02Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int number = num1; number <= num2 ; number++) {
            System.out.print(number + " ");
            sum = sum + number;
        }
        System.out.println();

        System.out.printf("Sum: %d" ,sum);
    }
}
