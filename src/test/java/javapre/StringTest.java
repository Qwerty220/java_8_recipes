package javapre;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {

    @Test
    public void aVoid() {

    }

    @Test
    public void stringPool() {
        String str1 = "str1";
        String str2 = "str1";

        assertEquals(str1, str2);
        assertTrue(str1 == str2);
    }

    @Test
    public void stringPoolIn() {
        String str1 = "a" + "b";

        String a = "a";
        String b = "b";
        String str2 = a + b;

        assertEquals(str1, str2);
        assertFalse(str1 == str2);

    }

    @Test
    public void stringPool2() {
        String str1 = new String("str1");
        String str2 = new String("str1");

        assertEquals(str1, str2);
        assertFalse(str1 == str2);
    }

}
