package Method1;

import java.util.Scanner;

public class Conversion {

    static double ex (double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the amount for exchange: ");
        double a = sc.nextDouble();

        System.out.print("Please enter the exchange rate: ");
        double b = sc.nextDouble();

        if (a <= 0 || b <= 0) {
            System.out.println("You entered 0 and/or negative value");
        } else {
            System.out.println("The result of the operation: " + ex(a,b));
        }



    }
}
