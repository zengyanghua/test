package com.convert;

import org.junit.Test;

import java.util.List;

public class TestConvert {

    @Test
    public void testLetterCombinations() {
        String digits = "0";
        List<String> list = Convert.letterCombinations(digits);
        System.out.println(list.size());
        System.out.println(list);
    }

    @Test
    public void testNumToLetter() {
        String digits = "0";
        List<String> list = Convert.numToLetter(digits);
        System.out.println(list.size());
        System.out.println(list);
    }

}
