import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Calendar;

public class TestNGDemo_1_1_SoftAssert {

    @Test
    public void softAddTest() throws InterruptedException {
        SoftAssert assertion=new SoftAssert();
        int result01= Calculator.add(4,2);
        System.out.println(result01);
        assertion.assertEquals(result01,6);

        int result02= Calculator.add(4,2);
        System.out.println(result02);
        assertion.assertEquals(result02,5);

        int result03= Calculator.add(4,2);
        System.out.println(result03);
        assertion.assertEquals(result03,6);

        int result04= Calculator.add(4,2);
        System.out.println(result04);
        assertion.assertEquals(result04,2);

        assertion.assertAll();
    }
}
