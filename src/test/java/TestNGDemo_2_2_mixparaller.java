import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo_2_2_mixparaller {
    @Test(threadPoolSize = 2,invocationCount = 10)
    public void addTest() throws InterruptedException{
        int result=Calculator.add(4,2);
        System.out.println("加法计算结果为： "+result);
        Assert.assertEquals(result,6);
    }

    @Test(threadPoolSize = 2,invocationCount = 10)
    public void subTest() throws InterruptedException{
        int result=Calculator.sub(4,2);
        System.out.println("减法计算结果为："+result);
    }
}

