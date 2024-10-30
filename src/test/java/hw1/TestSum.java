package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSub extends Config{
    @Test(dataProvider = "LongData", dataProviderClass = DataProviders.class)
    public void sub(long a, long b) {
        long expected =  a-b;
        Assert.assertEquals(calculator.sub(a, b), expected);
    }

    @Test(dataProvider = "DoubleData", dataProviderClass = DataProviders.class)
    public void sub(double a, double b) {
        double expected =  a-b;
        Assert.assertEquals(calculator.sub(a, b), expected);
    }

    @Test(dataProvider = "ZeroData", dataProviderClass = DataProviders.class)
    public void multiply(int a, int b) {
        int expected =  a-b;
        Assert.assertEquals(calculator.sub(a, b), expected);
    }
}



