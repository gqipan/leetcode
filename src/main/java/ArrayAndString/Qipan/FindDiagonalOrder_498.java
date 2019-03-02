package ArrayAndString.Qipan;

/**
 * 对角线遍历
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * <p>
 * 输出:  [1,2,4,7,5,3,6,8,9]
 * <p>
 * 解释:
 * <p>
 * <p>
 * <p>
 * 说明:
 * <p>
 * 给定矩阵中的元素总数不会超过 100000 。
 *
 * @author Qipan.G
 * @since 2019/3/2 19:42
 */
public class FindDiagonalOrder_498 {


    public static int[] solution_1(int[][] matrix) {

        // 获取矩阵的大小
        // M 行
        int M = matrix.length ;
        // 行为空
        if (M == 0){
            return new int[]{};
        }

        // N 列
        int N = matrix[0].length;


        int[] result = new int[M * N];
        int resultIndex = 0;
        // 遍历过程中，x + y = i
        int xy = M - 1 + N - 1;
        for (int i = 0; i <= xy; i++) {
            if (i == 0) {
                result[0] = matrix[0][0];
                resultIndex++;
                continue;
            }

            // 判断偶数还是奇数
            if (i % 2 == 0) {
                // 偶数：行从大往小访问
                for (int y = matrix.length - 1; y >= 0 ; y--) {
                    int j = i - y;
                    if (j < 0){
                        continue;
                    }
                    // i=4 y=1、0 时，超出了下标访问
                    if (j >= N) {
                        continue;
                    }
                    result[resultIndex] = matrix[y][j];
                    resultIndex++;
                }
            } else {
                // 奇数: 行从小往大访问
                for (int x = 0; x < matrix.length; x++) {

                    // 如果超过下标访问需要跳过这个循环
                    int j = i - x;
                    if (j < 0){
                        continue;
                    }
                    // 超过了下标访问，需要跳过这一次访问
                    if (j >= N){
                        continue;
                    }
                    result[resultIndex] = matrix[x][j];
                    resultIndex++;
                }
            }
        }
        return result;
    }

}
