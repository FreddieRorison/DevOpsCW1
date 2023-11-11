import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

   public Dec2HexTest() {}

   Dec2Hex dec2hex;

   @Before
   public void SetUp() {
      dec2hex = new Dec2Hex();
   }

   @Test
   public void testNormal() {
      dec2hex.DecConvert("5");
   }

   @Test
   public void testExtremeLow() {
      dec2hex.DecConvert("0");
   }
}
