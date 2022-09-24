package ProgBasics02Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String insertedCoin = scanner.nextLine();
        double sumMoney = 0;

        while (!insertedCoin.equals("Start")) {
            double insertedCoin2 = Double.parseDouble(insertedCoin);

            if (insertedCoin2 == 0.1 || insertedCoin2 == 0.2 ||
                    insertedCoin2 == 0.5 || insertedCoin2 == 1 || insertedCoin2 == 2) {

                sumMoney = sumMoney + insertedCoin2;
            } else {
                System.out.printf("Cannot accept %.2f%n", insertedCoin2);
            }
            insertedCoin = scanner.nextLine();
        }


        insertedCoin = scanner.nextLine();

        while (!insertedCoin.equals("End")) {

            switch (insertedCoin) {
                case "Nuts":
                    if (sumMoney >= 2) {
                        sumMoney -= 2;
                        System.out.printf("Purchased %s%n", insertedCoin);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Water":
                    if (sumMoney >= 0.7) {
                        sumMoney -= 0.7;
                        System.out.printf("Purchased %s%n", insertedCoin);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Crisps":
                    if (sumMoney >= 1.5) {
                        sumMoney -= 1.5;
                        System.out.printf("Purchased %s%n", insertedCoin);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Soda":
                    if (sumMoney >= 0.8) {
                        sumMoney -= 0.8;
                        System.out.printf("Purchased %s%n", insertedCoin);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Coke":
                    if (sumMoney >= 1.0) {
                        sumMoney -= 1.0;
                        System.out.printf("Purchased %s%n", insertedCoin);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    break;
            }

            insertedCoin = scanner.nextLine();


            }

        if (sumMoney >= 0) {
            System.out.printf("Change: %.2f" ,sumMoney);
        }


    }
}
