package algs.ArrayAndString.easy;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * <p>
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * @author Qipan.G
 * @since 2019/3/2 16:22
 */
public class E_PlusOne_66 {


    public static int[] solution_1(int[] digits) {
        // 先判断临界点
        if (digits.length == 1) {
            int num = digits[0];
            if (num == 9) {
                return new int[]{1, 0};
            } else {
                return new int[]{num + 1};
            }
        }

        boolean isOverflow = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            // 最后一个元素 digits[digits.length - 1]
            if (i == (digits.length - 1)) {
                if (digits[i] != 9){
                    digits[i] = digits[i] + 1;
                    return digits;
                }
                // 当 digits[digits.length - 1] 为 9 是
                isOverflow = true;
                digits[i] = 0;
                continue;
            }

            // 当前为9的时候
            if (isOverflow) {
                if (digits[i] == 9){
                    digits[i] = 0;
                }else {
                    isOverflow = false;
                    digits[i] = digits[i] + 1;
                }
            }
        }

        if (!isOverflow) {
            return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        System.arraycopy(digits, 0, result, 1, result.length - 1);
        return result;
    }
}
