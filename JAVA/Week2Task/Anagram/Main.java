package Anagram;

import static Anagram.AnagramCounter.findAnagrams;

public class Main {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println("The indexes where the anagrams can be found are: " + findAnagrams(s, p));
    }
}
