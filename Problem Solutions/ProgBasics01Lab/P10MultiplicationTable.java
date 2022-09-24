package ProgBasics01Lab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int num = 1;

        while (num <= 10) {
            int result = times * num;
            System.out.printf("%d X %d = %d%n" ,times ,num ,result);

            num++;
        }
    }
}
