import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

   public Dec2HexTest() {}

   Dec2Hex dec2hex;

   @Test
   public void testNormal() {
      dec2hex = new Dec2Hex(new String[]{"5"});
   }

   @Test
   public void testExtreme() {
      dec2hex = new Dec2Hex(new String[]{"0"});
   }
}
