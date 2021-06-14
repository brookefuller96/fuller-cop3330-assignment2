package oop.assignment2.ex25;

import java.util.Scanner;

public class Solution25 {

    private static final Scanner in = new Scanner(System.in);
    private static String password;

    public static void main(String[] args) {

        readUserInput();

        passwordStrengthDetector pass = new passwordStrengthDetector();
        int result = pass.passwordValidator(password);

        String output = generateOutput(result);
        System.out.println(output);

    }

    public static void readUserInput() {
        System.out.println("Create your password");
        password = in.nextLine();
    }

    public static String generateOutput(int passwordValidator) {

        switch(passwordValidator) {
            case 0:
                return "The password '" + password +  "' is a very weak password.";
            case 1:
            case 2: {
                return "The password '" + password + "' is a weak password.";
            }
            case 4:
            case 5:
            case 6:{
                return "The password '" + password + "' is a strong password.";
            }
            case 7:
            case 8: {
                return "The password '" + password + "' is a very strong password.";
            }
        }
        return"try again";
    }
}
