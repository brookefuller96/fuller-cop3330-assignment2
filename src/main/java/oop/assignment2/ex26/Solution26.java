package oop.assignment2.ex26;

import java.util.Scanner;

public class Solution26 {

    private static final Scanner in = new Scanner(System.in);
    private static String balance;
    private static String APR;
    private static String monthly_payment;

    public static void main(String[] args) {

        readUserInput();

        PaymentCalculator payment = new PaymentCalculator();
        int result = payment.PaymentCalculator ();


        System.out.println(output);

    }
    public static void readUserInput() {
        System.out.println("What is your balance?");
        balance = in.nextLine();

        System.out.println("What is the APR on the card (as a percent)?");
        APR = in.nextLine();

        System.out.println("What is the monthly payment you can make?");
        monthly_payment = in.nextLine();
    }

}
}
