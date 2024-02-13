import org.junit.Test;
import static org.junit.Assert.*;
public class TestOfByN {
    public CharacterComparator cc = new OffByN(5);
   @Test
   public void TestEqualChars(){
       assertTrue(cc.equalChars('a','f'));
       assertFalse(cc.equalChars('a','b'));
    }
}
