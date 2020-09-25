package com.ringcentral.jennifer.dojo.bestvalue

import org.testng.Assert
import org.testng.annotations.Test
import kotlin.math.abs

/**
 * Created by jennifer.huang on 2020/9/24.
 */
class FindBestValueTest {
    @Test
    fun test1() {
        var arr = intArrayOf(4, 9, 3)
        var target = 10
        var output = 3
        Assert.assertTrue(FindBestValue().findBestValue(arr, target) == output)
    }


    @Test
    fun test2() {
        var arr = intArrayOf(2, 3, 5)
        var target = 10
        var output = 5
        Assert.assertTrue(FindBestValue().findBestValue(arr, target) == output)
    }

    @Test
    fun test3() {
        var arr = intArrayOf(60864, 25176, 27249, 21296, 20204)
        var target = 56803
        var output = 11361
        Assert.assertTrue(FindBestValue().findBestValue(arr, target) == output)
    }


    @Test
    fun test4() {
        val arr = arrayOf(6, 2, 3, 2, 6)
        val target = 1
//        val max = arr.indices.map { i: Int -> arr[i] }.maxOrNull()
//        val maxIdx = arr.indexOf(arr.maxOrNull())
//        val list = arr.indices.filter { i: Int -> arr[i].equals(arr.maxOrNull()) }.toList()
//        println(list)
//        val neastIndexList = arr.indices.filter { i: Int -> arr[i].equals(arr.minOrNull()) }.toList()

        var left = arr.minOrNull()!!
        var right = target
//        if (right > left) return -1
        var possibleResultList:  MutableList<Integer> = mutableListOf<Integer>()
        val diffValueList:  MutableList<Int>  = mutableListOf<Int>()

//        while (left <= right) {
//            var mid = (left + right) / 2
////            val sum = changedArraySum(arr, mid)
//            val sum = 0
//            if (sum >= target) {
//                right = mid
//            } else {
//                left = mid
//            }
//            possibleResultList.add(Integer.valueOf(mid))
//            diffValueList.add(abs(sum - right))
//        }



        println("1111`1" )
        println("lllllxp" + diffValueList)
        println("1222" )

        val neastIndexList = arr.indices.filter { i: Int -> diffValueList[i].equals(2) }.toList()
    }
}