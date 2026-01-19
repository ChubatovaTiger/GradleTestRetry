package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;

import org.junit.Assert;
import org.junit.Test;

public class MyTest2 {

    @Test
    public void test42s() {
        // Read system property
        String failTest = System.getProperty("failTest", "false");

        if (Boolean.parseBoolean(failTest)) {
            Assert.fail("Test failed because failTest=true");
        }

        // Otherwise, the test passes
        System.out.println("Test passed!");
    }
}
