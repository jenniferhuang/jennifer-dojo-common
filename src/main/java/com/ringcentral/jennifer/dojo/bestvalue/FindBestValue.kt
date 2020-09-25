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
package com.ringcentral.jennifer.dojo.bestvalue

import kotlin.math.abs

class FindBestValue {
    fun findBestValue(arr: IntArray, target: Int): Int {
        var left = arr.minOrNull()!!
        var right = target
        if (right > left) return -1
        var possibleResultList = mutableListOf<Int>()
        var diffValueList = mutableListOf<Int>()

        while (left <= right) {
            var mid = (left + right) / 2
//            val sum = changedArraySum(arr, mid)
            val sum = 0
            if (sum >= target) {
                right = mid
            } else {
                left = mid
            }
            possibleResultList.add(mid)
            diffValueList.add(abs(sum - right))
        }

        val neastIndexList = arr.indices.filter { i: Int -> diffValueList[i].equals(arr.minOrNull()) }.toList()

//        var smallest = possibleResultList[neastIndexList[0]]
//        for (index in neastIndexList) {
//            if (smallest > possibleResultList[index])
//                smallest = possibleResultList[index]
//        }
        return 0
    }

//
//    private fun changedArraySum(arr: IntArray, changeValue: Int): Int {
//        var changedArray = arr
//        for (index in changedArray.indices) {
//            if (changedArray[index] > changeValue) {
//                changedArray[index] = changeValue
//            }
//        }
//        return changedArray.sum()
//    }


}