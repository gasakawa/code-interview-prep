package com.gasakawa.cip.strings;

import java.util.Arrays;

public class LicenseKeyFormating {

    public static String reformatString(String s, int k) {

        String[] letters = s.split("-");
        String newWord = String.join("", letters);
        int availableLetters = newWord.length();
        double division = (double) newWord.length() / (double) k;
        int groups = (int) Math.ceil(division);
        int start = 0;
        int end = 0;
        String[] words = new String[groups];

        for(int i = groups-1; i >= 0; i--) {

            if(availableLetters < k) {
                start = 0;
            }else {
                start = availableLetters - k;
            }
            end = availableLetters;
            String temp = newWord.substring(start, end);
            availableLetters = availableLetters - k;
            words[i] = temp.toUpperCase();
        }
        return String.join("-", words);

    }
}
