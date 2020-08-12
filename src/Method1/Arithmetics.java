package Method1;

import java.util.Scanner;

public class Arithmetics {

    public static void add (int a, int b) {
        System.out.println(a + b);
    }

    public static void sub (int a, int b) {
        System.out.println(a - b);
    }

    public static void mul (int a, int b) {
        System.out.println(a * b);
    }

    public static void div (int a, int b) {
        if (b != 0) {
            System.out.println((double)a / b);
        } else {
            System.out.println("Division by 0 not possible");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the operation symbol: ");
        String str = sc.next();

        switch (str) {
            case "+": {
                add(a, b);
                break;
            }
            case "-": {
                sub(a, b);
                break;
            }
            case "/": {
                div(a, b);
                break;
            }
            case "*": {
                mul(a, b);
                break;
            }
            default: {
                System.out.println("Value not applicable");
            }
        }
    }
}
