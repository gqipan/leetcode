package algs.ArrayAndString.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Qipan.G
 * @since 2020/4/1 23:12
 */
public class E_SingleNumber_136 {


}

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);

        for (int num : nums) {
            Integer count = map.get(num);
            count = count == null ? 1 : ++count;
            map.put(num, count);
        }

        return map.entrySet().stream()
                .filter(t -> t.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
    }
}

/**
 * 异或解法：异或运算满足交换律，a^b^a=a^a^b=b,因此ans相当于nums[0]^nums[1]^nums[2]^nums[3]^nums[4].....
 * 然后再根据交换律把相等的合并到一块儿进行异或（结果为0），然后再与只出现过一次的元素进行异或，
 * 这样最后的结果就是，只出现过一次的元素（0^任意值=任意值）
 */
class Solution_2 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
