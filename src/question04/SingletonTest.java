package question04;

import question04.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
   @Test
   public void test(){
       Singleton singleton = Singleton.getInstance();
       Singleton singleton1 = Singleton.getInstance();

       Assert.assertTrue(singleton == singleton1);

   }
}

