public class Calculator {
    public static int result=0;

    public static int add(int x, int y) throws InterruptedException{
        result=x+y;
        return  result;
    }

    public static int sub(int x,int y) throws InterruptedException{
        result=x-y;
        return result;

    }

    public static int devide(int x,int y) throws InterruptedException{
        result=x/y;
        Thread.sleep(1000);
        return result;
    }

    public static int count(int x) throws InterruptedException{
        int i=result;
        Thread.sleep(1000);
        result=i+x;
        return result;
    }

    public synchronized static int synCount(int x)throws InterruptedException{
        int i=result;
        Thread.sleep(1000);
        result=i+x;
        return result;
    }

    public static void clear(){
        result=0;
    }
}
