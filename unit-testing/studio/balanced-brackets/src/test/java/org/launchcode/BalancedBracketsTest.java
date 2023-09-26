package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true, "Empty test passes");
    }

    @Test
    public void singleOpenBracketTest() {
        String msg = "Single open bracket results in false";
        String str = "op[en";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, msg);
//        System.out.println(assertFalse(result, msg));
    }

    @Test
    public void singleCloseBracketTest() {
        String msg = "Single close bracket results in false";
        String str = "close]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, msg);
        System.out.println(result + ": " + msg);
    }

    @Test
    public void matchedBracketTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hi]"), "Matched bracket test");
    }

    @Test
    public void matchedDblBracketTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hi[there]]"), "Matched double bracket test");
    }

    @Test
    public void ReversedBracketTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]hi["), "Reversed bracket test");
    }

}
