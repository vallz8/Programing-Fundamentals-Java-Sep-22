package ProgBasics01Lab;

import java.util.Scanner;

public class P02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());

        if (gradeInput >= 3) {
            System.out.println("Passed!");
        }


    }
}
