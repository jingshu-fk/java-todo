package com.strings;

public class Alphabetical {
    public static void main(String[] args) {
        assert isAlphabetical("123bac");
        assert isAlphabetical("aBC");
        assert !isAlphabetical("xyzabc");
    }


    public static boolean isAlphabetical(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i+1))) {
                return false;
            }
        }
        return true;
    }
}


