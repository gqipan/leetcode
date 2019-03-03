package ArrayAndString.Qipan;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Qipan.G
 * @since 2019/3/2 16:58
 */
public class E_PlusOne_66_Test {

    @Test
    public void test_s1_1(){
        int[] nums = {1,2,3};
        int[] result = E_PlusOne_66.solution_1(nums);
        Assert.assertArrayEquals(new int[]{1, 2, 4}, result);
    }

    @Test
    public void test_s1_2(){
        int[] nums = {4,3,2,1};
        int[] result = E_PlusOne_66.solution_1(nums);
        Assert.assertArrayEquals(new int[]{4,3,2,2}, result);
    }

    @Test
    public void test_s1_3(){
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] result = E_PlusOne_66.solution_1(nums);
        Assert.assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, result);
    }

    @Test
    public void test_s1_4(){
        int[] nums = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] result = E_PlusOne_66.solution_1(nums);
        Assert.assertArrayEquals(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4}, result);
    }

    @Test
    public void test_s1_5(){
        int[] nums = {2,4,9,3,9};
        int[] result = E_PlusOne_66.solution_1(nums);
        Assert.assertArrayEquals(new int[]{2,4,9,4,0}, result);
    }

}
