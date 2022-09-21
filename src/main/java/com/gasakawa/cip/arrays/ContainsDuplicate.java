package com.gasakawa.cip.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> uniques = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (uniques.containsKey(num)) {
                return true;
            }
            uniques.put(num, num);
        }

        if (uniques.size() == nums.length)
            return false;

        return true;
    }

}