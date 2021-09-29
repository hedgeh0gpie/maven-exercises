import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
    @Test
    public void testIfCodeupIsCodeup() {
        assertEquals("Codeup", "CodeUp");
    }

    @Test
    public void testIfLanguagesIsMoreLanguages() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfLanguageContainsLetter() {

        String language = "PHP";

        assertTrue("PHP contains H", language.contains("H"));
        assertFalse("PHP does not contain J", language.contains("J"));
    }


}
