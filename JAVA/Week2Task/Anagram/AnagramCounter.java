package Anagram;

import java.util.ArrayList;
import java.util.List;

public class AnagramCounter {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26]; // Frequency array for characters in p
        int[] sCount = new int[26]; // Frequency array for the current window in s

        // Populate frequency array for p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int pLength = p.length();

        // Iterate through s using a sliding window
        for (int i = 0; i < s.length(); i++) {
            // Add the new character to the window
            sCount[s.charAt(i) - 'a']++;

            // Remove the character that is left out of the window
            if (i >= pLength) {
                sCount[s.charAt(i - pLength) - 'a']--;
            }

            // If the frequency arrays match, it's an anagram
            if (i >= pLength - 1 && matches(pCount, sCount)) {
                result.add(i - pLength + 1);
            }
        }

        return result;
    }

    private static boolean matches(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
    }
}
