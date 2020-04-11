package algs.ArrayAndString.Qipan;

import algs.ArrayAndString.middle.M_FindDiagonalOrder_498;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Qipan.G
 * @since 2019/3/2 20:15
 */
public class M_FindDiagonalOrder_498_Test {

    @Test
    public void test_s1_1() {
        int[][] nums = {
                {1, 2, 3 },
                {4, 5, 6 },
                {7, 8, 9 }
        };
        int[] result = M_FindDiagonalOrder_498.solution_1(nums);
        Assert.assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9}, result);
    }

    @Test
    public void test_s1_2() {
        int[][] nums = {{3},{2}};
        int[] result = M_FindDiagonalOrder_498.solution_1(nums);
        Assert.assertArrayEquals(new int[]{3,2}, result);
    }

    @Test
    public void test_s1_3() {
        int[][] nums = {};
        int[] result = M_FindDiagonalOrder_498.solution_1(nums);
        Assert.assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void test_s1_4() {
        int[][] nums = {{2, 3}};
        int[] result = M_FindDiagonalOrder_498.solution_1(nums);
        Assert.assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    public void test_s1_5() {
        int[][] nums = {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
                {8},
                {9},
                {10}
        };
        int[] result = M_FindDiagonalOrder_498.solution_1(nums);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, result);
    }
}
