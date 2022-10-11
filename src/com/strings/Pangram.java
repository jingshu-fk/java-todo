package com.strings;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean isPangram(String s) {
        boolean[] marked = new boolean[26];
        char[] values = s.toCharArray();
        for (char value : values) {
            if (Character.isLetter(value)) {
                int index = Character.isUpperCase(value)? value - 'A': value - 'a';
                marked[index] = true;
            }
        }
        for (boolean b : marked) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
