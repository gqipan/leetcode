package ArrayAndString.Bobi;

/**
 * . 寻找两个有序数组的中位数
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Median_of_Two_Sorted_Arrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int size = m+n;
        boolean odd = (size & 1) == 1;
        int index = 0;
        int[] temp = new int[size];

        int i = 0, j = 0;
        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                temp[index] = nums1[i++];
            }else {
                temp[index] = nums2[j++];
            }

            if (index == size / 2){
                if(odd){
                    return temp[index];
                }else {
                    return (temp[index-1] + temp[index]) / 2f;
                }
            }
            index++;
        }

        while (i < m){
            temp[index] = nums1[i++];
            if (index == size / 2){
                if(odd){
                    return temp[index];
                }else {
                    return (temp[index-1] + temp[index]) / 2f;
                }
            }
            index++;
        }
        while (j < n){
            temp[index] = nums2[j++];
            if (index == size / 2){
                if(odd){
                    return temp[index];
                }else {
                    return (temp[index-1] + temp[index]) / 2f;
                }
            }
            index++;
        }

        return 0;
    }
}
