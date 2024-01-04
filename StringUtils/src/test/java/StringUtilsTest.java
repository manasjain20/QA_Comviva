import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    StringUtils st = new StringUtils();

    @Test
    public void testReverse() {

        // Test cases for reverse method
        assertEquals("olleh", st.reverse("hello"));
        assertEquals("", st.reverse(""));
        assertEquals("12345", st.reverse("54321"));
        assertEquals("a", st.reverse("a"));
        assertEquals("dad", st.reverse("dad"));

    }

    @Test
    public void testIsPalindrome() {

        // Test cases for isPalindrome method
        assertTrue(st.isPalindrome("radar"));
        assertTrue(st.isPalindrome(""));
        assertFalse(st.isPalindrome("hello"));
        assertTrue(st.isPalindrome("madam"));
        assertFalse(st.isPalindrome("world"));

        // Additional assertions with assertTrue and assertFalse
        assertTrue(st.isPalindrome("malayalam"));
        assertFalse(st.isPalindrome("facebook"));
    }

    @Test
    public void testConcatenate() {

        // Test cases for concatenate method
        assertEquals("HelloWorld", st.concatenate("Hello", "World"));
        assertEquals("Test", st.concatenate("Test", ""));
        assertEquals("123", st.concatenate("", "123"));
        assertEquals("Instagram", st.concatenate("Insta", "gram"));



    }

    @Test
    public void testCountOccurrences() {

        // Test cases for countOccurrences methods
        assertEquals(2, st.countOccurrences("hello", 'l'));
        assertEquals(0, st.countOccurrences("", 'a'));
        assertEquals(2, st.countOccurrences("java", 'a'));
        assertEquals(2, st.countOccurrences("system", 's'));
        assertEquals(1, st.countOccurrences("testing", 'g'));

    }
}