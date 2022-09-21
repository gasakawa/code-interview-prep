package com.gasakawa.cip.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LicenseKeyFormattingTests {

    @Test
    public void testReformatStringWith4() {
        String format = LicenseKeyFormating.reformatString("5F3Z-2e-9-w", 4);
        assertEquals(format, "5F3Z-2E9W");
    }

    @Test
    public void testReformatStringWith2() {
        String format = LicenseKeyFormating.reformatString("2-5g-3-J", 2);
        assertEquals(format, "2-5G-3J");
    }


}
