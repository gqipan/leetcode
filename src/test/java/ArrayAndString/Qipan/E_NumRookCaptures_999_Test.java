package ArrayAndString.Qipan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Qipan.G
 * @since 2019/3/3 14:32
 */
public class E_NumRookCaptures_999_Test {

    @Test
    public void solution_1() {

        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };

        int result = E_NumRookCaptures_999.solution_1(board);
        Assert.assertEquals(3, result);
    }
    @Test
    public void solution_2() {

        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'p','p','.','R','.','p','B','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','B','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };

        int result = E_NumRookCaptures_999.solution_1(board);
        Assert.assertEquals(3, result);
    }
}