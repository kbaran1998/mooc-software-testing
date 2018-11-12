package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    GHappy gHappy = new GHappy();

    @ParameterizedTest
    @CsvSource({"xxggxx", "bdsagg", "ggbdsa", "ggggggg"})
    public void testTrueCases(String testString) {
        Assertions.assertTrue(gHappy.gHappy(testString));
    }

    @ParameterizedTest
    @CsvSource({"xxgxx", "xxggyygxx", "gbdsa", "bdsag"})
    public void testFalseCases(String testString) {
        Assertions.assertFalse(gHappy.gHappy(testString));
    }

}
