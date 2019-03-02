package ArrayAndString.Qipan;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Qipan.G
 * @since 2019/3/2 14:00
 */
public class PivotIndex_724_Test {

    @Test
    public void test_s1_1() {
        int[] nums = {1,7,3,6,5,6};
        int index = PivotIndex_724.solution_1(nums);
        Assert.assertEquals(3, index);
    }

    @Test
    public void test_s1_2() {
        int[] nums = {-1,-1,-1,1,1,1};
        int index = PivotIndex_724.solution_1(nums);
        Assert.assertEquals(-1, index);
    }


    @Test
    public void test_s1_3() {
        int[] nums = {-1,-1,-1,0,1,1};
        int index = PivotIndex_724.solution_1(nums);
        Assert.assertEquals(0, index);
    }
}
