package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {

        //given
        anagramDetector detector = new anagramDetector();


        // when call detector
        boolean expected = true;
        boolean actual = detector.isAnagram("note","note");

        // then result
        assertEquals(expected, actual);
    }
    @Test
    
}