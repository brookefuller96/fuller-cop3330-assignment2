package oop.assignment2.ex26;
import static java.lang.Math.*;

public class PaymentCalculator{

    public int calculateMonthsUntilPaidOff(String balance, String APR, String monthly_payment) {
        // n = number of months
        // i = daily rate (APR/365)
        // b = balance
        // p = monthly payment
        try {
            int b = Integer.parseInt(balance);
            int i = ((Integer.parseInt(APR)) / 365);
            int p = Integer.parseInt(monthly_payment);
            int n = -(1 / 30) * log(1 + b / p * (1 - (1 + i) ^ 30)) / log(1 + i);
            return n;

        } catch (Exception notInt) {
            System.out.println("Not a valid input.");
            return 0;
        }

    }
}