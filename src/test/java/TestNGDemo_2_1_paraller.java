import org.testng.annotations.Test;

//testng的并发场景
public class TestNGDemo_2_1_paraller {
    //threadPoolSize线程池数量，invocationCount重复次数
    @Test(threadPoolSize = 2,invocationCount = 10)
    public void countTest() throws InterruptedException{
        int result=Calculator.count(1);
        long threadID=Thread.currentThread().getId();
        System.out.println("线程ID："+threadID+"为您计算，结果为： "+result);
    }

    @Test(threadPoolSize = 2,invocationCount = 10)
    public void countTest02() throws InterruptedException{
        int result=Calculator.synCount(1);
        long threadId=Thread.currentThread().getId();
        System.out.println("线程ID："+threadId+"为您计算，结果为："+result);
    }
}
