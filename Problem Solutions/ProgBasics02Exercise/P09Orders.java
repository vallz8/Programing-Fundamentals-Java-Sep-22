package ProgBasics02Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sumPrice = 0;

        for (int i = 1; i <= n ; i++) {
            double pricePerCap = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capCount = Integer.parseInt(scanner.nextLine());

            double price = ((days * capCount) * pricePerCap);

            sumPrice = sumPrice + price;

            System.out.printf("The price for the coffee is: $%.2f%n" ,price);

        }
        System.out.printf("Total: $%.2f" , sumPrice);
    }
}
