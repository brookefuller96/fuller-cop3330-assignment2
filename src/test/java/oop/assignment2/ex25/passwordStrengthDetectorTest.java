package oop.assignment2.ex25;

import oop.assignment2.ex24.base.anagramDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordStrengthDetectorTest {

    @Test
    void howStrong_only_nums_weak() {
        //given
        passwordStrengthDetector detector = new passwordStrengthDetector();


        // when call detector
        int expected = 0;
        int actual = detector.passwordValidator("1234567");

        // then result
        assertEquals(expected, actual);
    }
    @Test
    void howStrong_only_letters_weak() {
        //given
        passwordStrengthDetector detector = new passwordStrengthDetector();


        // when call detector
        int expected = 1;
        int actual = detector.passwordValidator("abcdefg");

        // then result
        assertEquals(expected, actual);
    }
    @Test
    void howStrong_very_strong() {
        //given
        passwordStrengthDetector detector = new passwordStrengthDetector();


        // when call detector
        int expected = 8;
        int actual = detector.passwordValidator("Jimmy1234!!");

        // then result
        assertEquals(expected, actual);
    }
    @Test
    void howStrong_strong() {
        //given
        passwordStrengthDetector detector = new passwordStrengthDetector();
   

        // when call detector
        int expected = 6;
        int actual = detector.passwordValidator("Coco1234");

        // then result
        assertEquals(expected, actual);
    }
    @Test
    void howStrong_very_strong_no_caps() {
        //given
        passwordStrengthDetector detector = new passwordStrengthDetector();


        // when call detector
        int expected = 7;
        int actual = detector.passwordValidator("coco1234!!@");

        // then result
        assertEquals(expected, actual);
    }
}