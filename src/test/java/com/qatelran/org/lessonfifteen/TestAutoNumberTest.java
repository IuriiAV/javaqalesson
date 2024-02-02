package com.qatelran.org.lessonfifteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAutoNumberTest {

    private NumberChecker numberChecker;

    @BeforeEach
    public void init() {
        numberChecker = new NumberChecker();
    }

    @Test
    public void isCorrectNumberWhenNumberIsRight() {
        assertTrue(numberChecker.isCorrectNumber("sf345ert"));
    }

    @Test
    public void isCorrectNumberWhenNumberIsNotRight() {
        assertFalse(numberChecker.isCorrectNumber("s3d455ff"));
    }

    @Test
    public void isCorrectNumberWhenNumberIsRightAndCustomPatter() {
        String otherPattern = "[a-z][a-z]\\d\\d\\d[a-z][a-z][a-z][a-z]";
        NumberChecker otherChecker = new NumberChecker(otherPattern);
        assertTrue(otherChecker.isCorrectNumber("dd444eeee"));
    }
}