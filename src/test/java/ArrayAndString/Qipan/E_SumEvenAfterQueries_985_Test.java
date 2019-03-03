package ArrayAndString.Qipan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Qipan.G
 * @since 2019/3/3 13:43
 */
public class E_SumEvenAfterQueries_985_Test {

    @Test
    public void solution_1() {
        int[] A = {1,2,3,4};
        int[][] queries = {
            {1,0},
            {-3,1},
            {-4,0},
            {2,3}
        };

        int[] result = E_SumEvenAfterQueries_985.solution_1(A, queries);
        Assert.assertArrayEquals(new int[]{8,6,2,4}, result);
    }
}