package ProgBasics02Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;
        double pricePerMan = 0;


        if (typePeople.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                totalPrice = group * 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                totalPrice = group * 9.8;
            }else if (dayOfWeek.equals("Sunday")) {
                totalPrice = group * 10.46;
            }
            if (group >= 30) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            }

        }else if (typePeople.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                totalPrice = group * 10.9;
                pricePerMan = 10.9;
            } else if (dayOfWeek.equals("Saturday")) {
                totalPrice = group * 15.6;
                pricePerMan = 15.6;
            }else if (dayOfWeek.equals("Sunday")) {
                totalPrice = group * 16;
                pricePerMan = 16;
            }
            if (group >= 100) {
                totalPrice = totalPrice - (pricePerMan * 10);
            }
        }else if (typePeople.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                totalPrice = group * 15;
            } else if (dayOfWeek.equals("Saturday")) {
                totalPrice = group * 20;
            }else if (dayOfWeek.equals("Sunday")) {
                totalPrice = group * 22.5;
            }
            if (group >= 10 && group <= 20) {
                totalPrice = totalPrice - (totalPrice * 0.05);
            }

            }

        System.out.printf("Total price: %.2f" , totalPrice);

        }

    }

