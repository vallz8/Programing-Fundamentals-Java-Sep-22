package DataTypesAndVariables03Lab;

import java.util.Scanner;

public class P11RefactorVolumePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double volume = 1.0 / 3.0 * (length * width) * height;

        System.out.printf("Length: ");

        System.out.printf("Width: ");

        System.out.printf("Height: ");


        System.out.printf("Pyramid Volume: %.2f%n", volume);



    }
}
