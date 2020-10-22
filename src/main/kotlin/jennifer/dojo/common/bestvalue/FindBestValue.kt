/**
 * @Description:
 *
给你一个整数数组 arr 和一个目标值 target ，请你返回一个整数 value ，使得将数组中所有大于 value 的值变成 value 后，数组的和最接近  target （最接近表示两者之差的绝对值最小）。
如果有多种使得和最接近 target 的方案，请你返回这些整数中的最小值。
请注意，答案不一定是 arr 中的数字。
Example 1:
Input: arr = [4,9,3], target = 10
Output: 3
Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.
Example 2:
Input: arr = [2,3,5], target = 10
Output: 5
Constraints:
1 <= arr.length <= 10^4
1 <= arr[i], target <= 10^5
 * @Author jasper.lin
 * @Date 2020/8/27
 */
package jennifer.dojo.common.bestvalue

import java.util.*
import kotlin.math.abs

class FindBestValue {
    fun findBestValue(arr: IntArray, target: Int): Int {
        arr.sort()
        var length = arr.size;
        var prefixSum = IntArray(length + 1);
        for (i in prefixSum.indices) {
            if (i == 0) {
                continue
            }
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        var result = 0
        var diff = target
        for (i in 0..arr[length - 1]) {
            var index = Arrays.binarySearch(arr, i);
            if (index < 0) {
                index = -index - 1;
            }

            println("target $i index: $index in the array")
            println("${prefixSum[index]} + ${(length - index) * i}")
            println()
            var currentSum = prefixSum[index] + (length - index) * i
            println("i=$i; sum=$currentSum")
            if (abs(currentSum - target) < diff) {
                result = i
                diff = abs(currentSum - target)
            }
        }
        return result
    }
}