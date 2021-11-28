import org.testng.Assert;
import org.testng.annotations.Test;

public class testngDemo1 {
    @Test
    public void evnTest(){

        Assert.assertEquals(1,3,"实际值与期望结果不符！");
    }
}
