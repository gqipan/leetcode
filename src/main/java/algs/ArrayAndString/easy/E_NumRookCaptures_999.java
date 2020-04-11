package algs.ArrayAndString.easy;

/**
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 *
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 *
 * 返回车能够在一次移动中捕获到的卒的数量。
 *
 * @author Qipan.G
 * @since 2019/3/3 14:16
 */
public class E_NumRookCaptures_999 {


    public static int solution_1(char[][] board){

        int index_i = 0;
        int index_j = 0;

        // 找到 白色的车 的位置
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R'){
                    index_i = i;
                    index_j = j;
                    break;
                }
            }
        }

        int result = 0;

        // 向上查找，北
        for (int i = index_i - 1; i >=0  ; i--) {
            if (board[i][index_j] == 'B'){
                break;
            }
            if (board[i][index_j] == 'p'){
                result++;
                break;
            }
        }


        // 向下查找, 南
        for (int i = index_i + 1; i < board.length; i++) {
            if (board[i][index_j] == 'B'){
                break;
            }
            if (board[i][index_j] == 'p'){
                result++;
                break;
            }
        }

        // 向右查找 东
        for (int j = index_j + 1; j < board[index_i].length; j++) {
            if (board[index_i][j] == 'B'){
                break;
            }
            if (board[index_i][j] == 'p'){
                result++;
                break;
            }
        }

        // 向左查找
        for (int j = index_j - 1; j >= 0; j--) {
            if (board[index_i][j] == 'B'){
                break;
            }
            if (board[index_i][j] == 'p'){
                result++;
                break;
            }
        }

        return result;
    }

}
