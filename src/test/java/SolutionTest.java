import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void decodeAtIndexTest1() {
        String s = "leet2code3";
        int k = 10;
        String expected = "o";
        String actual = new Solution().decodeAtIndex(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decodeAtIndexTest2() {
        String s = "ha22";
        int k = 5;
        String expected = "h";
        String actual = new Solution().decodeAtIndex(s, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decodeAtIndexTest3() {
        String s = "a2345678999999999999999";
        int k = 1;
        String expected = "a";
        String actual = new Solution().decodeAtIndex(s, k);

        Assert.assertEquals(expected, actual);
    }
}
