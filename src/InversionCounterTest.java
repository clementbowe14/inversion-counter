import org.junit.Assert;
import org.junit.Test;

public class InversionCounterTest {

    @Test
    public void testNoInversionsInSortedArray() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        InversionCounter counter = new InversionCounter();
        long noInversions = counter.countInversions(array);
        Assert.assertEquals(0, noInversions);
    }

    @Test
    public void testInversionsInLeftSideOfArray() {
        int[] array = {4,1,5,2,3,6,7,8,9};


        InversionCounter counter = new InversionCounter();
        long inversions = counter.countInversions(array);
        Assert.assertEquals(5, inversions);
    }

    @Test
    public void testInversionsInRightSideOfArray() {
        int[] array = {1,2,3,4,5,8,9,6,7};
        InversionCounter counter = new InversionCounter();
        long inversions = counter.countInversions(array);
        Assert.assertEquals(4, inversions);
    }

    @Test
    public void testInversionsInSplitArray() {
        int[] array = {1,7,3,4,5,6,2,8,9};
        InversionCounter counter = new InversionCounter();
        long inversions = counter.countInversions(array);
        Assert.assertEquals(9, inversions);
    }
}
