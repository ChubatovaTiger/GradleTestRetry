package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;

public class mytest10 {

    @Test
    public void test41flk1() {
        if (System.currentTimeMillis()%2==1){
        }
        else {
           // Assert.fail("fails with probability 50%");

        };

    };
    
    @Test
    public void test42s() {

            Assert.fail("always fails");


    }



}
