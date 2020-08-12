package Method1;

import java.util.Scanner;

public class NumbersCheck {

    static void printSign(int i) {

        if (i > 0) {
            System.out.println("Value > 0");
        }
        else {
            System.out.println("Value is less than or equal to 0");
        }
    }

    static boolean isSimple (int z) {
        if (z == 1)  {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(z); j++) {

            if (z % j == 0 ) {
                return false;
            }
        }
        return true;
    }

    static boolean divTwo (int x) {

        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    static boolean divFive (int x) {

        if (x % 5 == 0) {
            return true;
        }
        return false;
    }

    static boolean divThree (int x) {

        if (x % 3 == 0) {
            return true;
        }
        return false;
    }

    static boolean divSix (int x) {

        if (divTwo(x) && divThree(x)) {
            return true;
        }
        return false;
    }

    static boolean divNine (int x) {

        if (x % 9 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("PLease enter the number: ");
        int b = sc1.nextInt();

        printSign(b);
        System.out.println(isSimple(b));
        System.out.println(divTwo(b));
        System.out.println(divThree(b));
        System.out.println(divFive(b));
        System.out.println(divSix(b));
        System.out.println(divNine(b));


    }
}
