package com.viviman.leetcode.dan_ci_pin_lv;

import java.util.HashMap;

/**
 设计一个方法，找出任意指定单词在一本书中的出现频率。

 你的实现应该支持如下操作：

 WordsFrequency(book)构造函数，参数为字符串数组构成的一本书
 get(word)查询指定单词在书中出现的频率
 示例：
    WordsFrequency wordsFrequency = new WordsFrequency({"i", "have", "an", "apple", "he", "have", "a", "pen"});
    wordsFrequency.get("you"); //返回0，"you"没有出现过
    wordsFrequency.get("have"); //返回2，"have"出现2次
    wordsFrequency.get("an"); //返回1
    wordsFrequency.get("apple"); //返回1
    wordsFrequency.get("pen"); //返回1
 */
public class WordsFrequency {

    public HashMap<String, Integer> map;

    public WordsFrequency(String[] book) {
        map = new HashMap<>();
        if(book == null){
            return;
        }
        Integer integer;
        for (int i = 0, j = book.length; i < j; i++) {
            if(book[i] == null){
                continue;
            }
            integer = map.get(book[i]);
            if(integer == null){
                map.put(book[i], 1);
            } else {
                map.put(book[i], integer + 1);
            }
        }
    }

    public int get(String word) {
        if(word == null){
            return 0;
        }
        Integer integer = map.get(word);
        return integer==null?0:integer;
    }
}
