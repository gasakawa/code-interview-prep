package com.gasakawa.cip.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTests {

    @Test
    public void testContainsDuplicateTrue() {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    public void testContainsDuplicateFalse() {
        int[] nums = { 1, 2, 3, 4 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }
}
