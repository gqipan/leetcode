package algs.ArrayAndString.easy;

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 *
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *
 * 如果是，则返回最大元素的索引，否则返回-1。
 *
 * 示例 1:
 *  输入: nums = [3, 6, 1, 0]
 *  输出: 1
 *  解释: 6是最大的整数, 对于数组中的其他整数,
 *  6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 *
 *
 * 示例 2:
 *  输入: nums = [1, 2, 3, 4]
 *  输出: -1
 *  解释: 4没有超过3的两倍大, 所以我们返回 -1.
 *
 *
 * 提示:
 *  nums 的长度范围在[1, 50].
 *  每个 nums[i] 的整数范围在 [0, 99].
 *
 * @author Qipan.G
 * @since 2019/3/2 15:51
 */
public class E_DominantIndex_747 {


    public static int solution_1(int[] nums) {
        if (nums.length < 1 || nums.length > 50){
            return -1;
        }

        // 找到数组的最大值
        int maxIndex = -1;
        int maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue){
                maxValue = nums [i];
                maxIndex = i;
            }
        }

        // 如果数组全部为0，没找到最大值。
        if (maxIndex == -1){
            return -1;
        }

        // 判断最大值是否至少其他元素两倍
        boolean hasNotDominantIndex = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == maxIndex){
                continue;
            }
            if ((nums[i] << 1) > maxValue ) {
                hasNotDominantIndex = true;
                continue;
            }
        }

        if (!hasNotDominantIndex){
            return maxIndex;
        }
        return -1;
    }
}
