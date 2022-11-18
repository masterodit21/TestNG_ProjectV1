import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCalculatorTest {
    @Test
    void testpenjumlahan(){
        int a = 20, b = 60;
        int expected = a + b;
        int actual = MyCalculator.penjumlahan(a, b);

        Assert.assertEquals(expected, actual);
    }
    @Test
    void testpengurangan(){
        int a = 10, b = 5;
        int expected = a - b;
        int actual = MyCalculator.pengurangan(a, b);

        Assert.assertEquals(expected, actual);
    }
    @Test
    void testpembagian(){
        int a = 20, b = 4;
        int expected = a / b;
        int actual = MyCalculator.pembagian(a, b);

        Assert.assertEquals(expected, actual);
    }
    @Test
    void testmodulus(){
        int a = 100, b = 10;
        int expected = a % b;
        int actual = MyCalculator.modulus(a, b);

        Assert.assertEquals(expected, actual);
    }

}
