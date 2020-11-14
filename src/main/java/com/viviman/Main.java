package com.viviman;

import com.viviman.leetcode.dan_ci_pin_lv.WordsFrequency;

public class Main {
    public static void main(String[] args) {
        System.out.println("测试学习力扣代码信息！");

        WordsFrequency wordsFrequency = new WordsFrequency(new String[]{"i", "have", "an", "apple", "he", "have", "a", "pen"});
        System.out.println(wordsFrequency.get("you")); //返回0，"you"没有出现过
        System.out.println(wordsFrequency.get("have"));; //返回2，"have"出现2次
        System.out.println(wordsFrequency.get("an"));//返回1
        System.out.println(wordsFrequency.get("apple")); //返回1
        System.out.println(wordsFrequency.get("pen")); //返回1
    }
}
