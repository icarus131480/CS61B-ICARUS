import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {

    static CharacterComparator offByOne = new OffByOne();
    @Test
    public void TestEqualChars(){
        assertTrue(offByOne.equalChars('a','b'));
        assertFalse(offByOne.equalChars('c','c'));
    }


}
