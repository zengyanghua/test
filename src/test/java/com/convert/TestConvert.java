package com.convert;

import org.junit.Test;

import java.util.List;

public class TestConvert {
    /**
     * 数字转字母测试
     */
    @Test
    public void testLetterCombinations() {
        String digits = "23";
        List<String> list = Convert.letterCombinations(digits);
        System.out.println(list);
    }

    /**
     * 0-99数字转字母测试
     */
    @Test
    public void testNumToLetter() {
        String digits = "23";
        List<String> list = Convert.numToLetter(digits);
        System.out.println(list);
    }

}
