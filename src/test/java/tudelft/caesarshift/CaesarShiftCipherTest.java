package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();


    @ParameterizedTest
    @CsvSource({"asa1dsd", "13,dds", "<d@"})
    public void testInvalidChar(String invalid){
        String result = "invalid";
        Assertions.assertEquals(result, caesarShiftCipher.CaesarShiftCipher(invalid, 1));
    }

    @ParameterizedTest
    @CsvSource({"number, ovncfs", "great, hsfbu", "shift, tijgu"})
    public void test1ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, 1));
    }

    @ParameterizedTest
    @CsvSource({"number, number", "great, great", "shift, shift"})
    public void test0ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, 0));
    }

    @ParameterizedTest
    @CsvSource({"number, mtladq", "great, fqdzs", "shift, rghes"})
    public void testMin1ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, -1));
    }

    @ParameterizedTest
    @CsvSource({"number, mtladq", "great, fqdzs", "shift, rghes"})
    public void test25ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, 25));
    }
    @ParameterizedTest
    @CsvSource({"number, number", "great, great", "shift, shift"})
    public void test26ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, 26));
    }

    @ParameterizedTest
    @CsvSource({"number, ovncfs", "great, hsfbu", "shift, tijgu"})
    public void test27ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, 27));
    }

    @ParameterizedTest
    @CsvSource({"abc, def", "xyz, abc"})
    public void test3ShiftChar(String actual, String cifer){
        Assertions.assertEquals(cifer, caesarShiftCipher.CaesarShiftCipher(actual, 3));
    }

}
