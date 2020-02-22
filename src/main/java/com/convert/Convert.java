package com.convert;

import java.util.*;

/**
 * 题目
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 直接使用迭代的方法
 */
public class Convert {

    /**
     * 字母组合
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        //字母组合结果集
        List<String> result = new ArrayList<String>();
        //数字字符串长度为0时，返回空
        if (digits.length() == 0) {
            return result;
        }
        //做数字到字母的映射（与电话按键相同），注意 1 不对应任何字母。
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        //数字字符串转数组
        char[] digitsChars = digits.toCharArray();
        result.add("");
        //遍历字符数组
        for (char c : digitsChars) {
            List<String> tmpList = new ArrayList<String>();
            //拿到数字对应的字母串
            String sufStr = map.get(c);
            //排除0 1
            if (sufStr != null) {
                //拼接结果str，并加入的临时集合中
                for (String resultStr : result) {
                    for (Character tmpC : sufStr.toCharArray()) {
                        //将新增的字母拼接到后面
                        String tmpStr = resultStr + tmpC;
                        //添加到临时集合中
                        tmpList.add(tmpStr);
                    }
                }
                //将临时集合中数据转移到返回的结果集合中
                result = tmpList;
            }
        }
        return result;
    }

    /**
     * 0-99的数字转字母
     * @param number
     * @return
     */
    public static List<String> numToLetter(String number) {
        //字母组合结果集
        List<String> result = new ArrayList<String>();
        int num = Integer.parseInt(number);
        if (num < 0 || num > 99) {
            return result;
        }
        //数字字符串长度为0时，返回空
        if (number.length() == 0) {
            return result;
        }
        //做数字到字母的映射（与电话按键相同），注意 1 不对应任何字母。
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        //数字字符串转数组
        char[] digitsChars = number.toCharArray();
        result.add("");
        //遍历字符数组
        for (char c : digitsChars) {
            List<String> tmpList = new ArrayList<String>();
            //拿到数字对应的字母串
            String sufStr = map.get(c);
            //排除0 1
            if (sufStr != null) {
                //拼接结果str，并加入的临时集合中
                for (String resultStr : result) {
                    for (Character tmpC : sufStr.toCharArray()) {
                        //将新增的字母拼接到后面
                        String tmpStr = resultStr + tmpC;
                        //添加到临时集合中
                        tmpList.add(tmpStr);
                    }
                }
                //将临时集合中数据转移到返回的结果集合中
                result = tmpList;
            }
        }
        return result;
    }
}
