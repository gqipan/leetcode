package algs.ArrayAndString.Qipan;

import algs.ArrayAndString.easy.E_DominantIndex_747;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Qipan.G
 * @since 2019/3/2 16:03
 */
public class E_DominantIndex_747_Test {

    @Test
    public void test_s1_1() {
        int[] nums = {3, 6, 1, 0};
        int dominanIndex = E_DominantIndex_747.solution_1(nums);
        Assert.assertEquals(1, dominanIndex);
    }

    @Test
    public void test_s1_2() {
        int[] nums = {1, 2, 3, 4};
        int dominantIndex = E_DominantIndex_747.solution_1(nums);
        Assert.assertEquals(-1, dominantIndex);
    }

    @Test
    public void test_s1_3(){
        int[] nums = {1};
        int dominantIndex = E_DominantIndex_747.solution_1(nums);
        Assert.assertEquals(0, dominantIndex);
    }

}
