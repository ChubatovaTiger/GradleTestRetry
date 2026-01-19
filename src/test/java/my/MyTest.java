package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void test42s() {
        // Get the property
        String buildName = System.getProperty("buildName", "");

        // Fail if it equals "Build 1"
        if ("Build 1".equals(buildName)) {
            Assert.fail("Failing test because buildName == 'Build 1'");
        }

        // Otherwise test passes
        System.out.println("Test passed, buildName=" + buildName);
    }
}
