package oop.assignment2.ex24.base;

import java.util.Scanner;


public class Solution24 {

    private static final Scanner in = new Scanner(System.in);
    private static String word1;
    private static String word2;

    public static void main(String[] args){
        readUserInput();

        anagramDetector ad = new anagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);
        System.out.println(output);
    }

    public static void readUserInput(){
        System.out.println("Enter word 1");
        word1 = in.next();

        System.out.println("Enter word 2");
        word2 =in.next();

    }

    public static String generateOutput(boolean isAnagram){
        if(isAnagram){
            return "is anagram";
        }
        else
        {
            return "is not anagram";
    }
    }
}
