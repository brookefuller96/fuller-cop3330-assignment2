package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramDetectorTest {

    @Test
    void isAnagram_returns_false_for_anagrams() {

        //given
        anagramDetector detector = new anagramDetector();


        // when call detector
        boolean expected = false;
        boolean actual = detector.isAnagram("1234","4321");

        // then result
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams() {

        //given
        anagramDetector detector = new anagramDetector();


        // when call detector
        boolean expected = true;
        boolean actual = detector.isAnagram("Tom Marvolo Riddle","I am Lord Voldemort");

        // then result
        assertEquals(expected, actual);
    }



}