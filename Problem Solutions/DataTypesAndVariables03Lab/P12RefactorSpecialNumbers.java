package DataTypesAndVariables03Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
           int currentNum = i;
           int sum = 0;

            while (currentNum > 0) {
                sum = sum + (currentNum % 10);
                i = currentNum / 10;

            }

            if (currentNum == 5 || currentNum == 7 || currentNum == 11) {
                System.out.printf("(%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n" , currentNum);
            }


        }
    }
}
