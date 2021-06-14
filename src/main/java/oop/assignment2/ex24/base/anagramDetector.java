package oop.assignment2.ex24.base;

import java.util.Arrays;

public class anagramDetector {
    public boolean isAnagram(String word1, String word2) {

        // check if it is a number

        try{
            double val = Double.parseDouble(word1);
            double val2 = Double.parseDouble(word2);
            System.out.println("Numbers cannot be anagrams. Try again.");
            return false;
        }
        catch(Exception notANum) {
            // check length of strings if not same length then false

            int w1 = word1.replace(" ","").length();
            int w2 = word2.replace(" ","").length();

            if (w1 != w2)
                return false;

            // make lowercase so can compare

            String newword1 = word1.toLowerCase();
            String newword2 = word2.toLowerCase();

            // sort the arrays and use a for loop to check each letter
            char[] word1array = newword1.replace(" ","").toCharArray();
            char[] word2array = newword2.replace(" ","").toCharArray();


            Arrays.sort(word1array);
            Arrays.sort(word2array);

            for (int i = 0; i < w1; i++) {
                if (word1array[i] != word2array[i])
                    return false;
            }

            return true;
        }
    }
}
