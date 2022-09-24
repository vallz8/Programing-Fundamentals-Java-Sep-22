package ProgBasics01Lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inItHours = Integer.parseInt(scanner.nextLine());

        int inItMinutes = Integer.parseInt(scanner.nextLine());


        int allMinutes = (inItHours * 60) + inItMinutes + 30;


        int hour = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }


        System.out.printf("%d:%02d" , hour, minutes);
    }
}
