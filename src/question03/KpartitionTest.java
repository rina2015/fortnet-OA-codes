package question03;

import org.junit.Assert;
import org.junit.Test;

public class KpartitionTest {

   @Test
   public void testKpartition(){
       Kpartition kpartition = new Kpartition();
       int[] input = null;
       int k = 0;
       Boolean output = kpartition.separateArray(input, k);
       Assert.assertFalse(output);

       input = new int[0];
       output = kpartition.separateArray(input, k);
       Assert.assertFalse(output);

       input = new int[]{2, 1, 4, 5, 6};
       output = kpartition.separateArray(input, k);
       Assert.assertFalse(output);

       k = 3;
       output = kpartition.separateArray(input, k);
       Assert.assertTrue(output);

   }
}


