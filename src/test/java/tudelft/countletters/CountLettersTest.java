package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWord0Matches() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void lastWordMatchesRMiddle() {
        int words = new CountLetters().count("catr|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordMatchesREnd() {
        int words = new CountLetters().count("cat|dogr");
        Assertions.assertEquals(1, words);
    }
}