package com.ringcentral.jennifer.dojo.ksimilar

import org.testng.Assert
import org.testng.annotations.Test

/**
 * Created by jennifer.huang on 2020/9/24.
 */
class KSimilarStringsTest {
    @Test
    fun test1() {
        val a = "ab"
        val b = "ba"
        Assert.assertEquals(KSimilarStrings().getSwapNumber(a, b), 1)
    }

    @Test
    fun test2() {
        val a = "abc"
        val b = "bca"
        Assert.assertEquals(KSimilarStrings().getSwapNumber(a, b), 2)
    }

    @Test
    fun test3() {
        val a = "abac"
        val b = "baca"
        Assert.assertEquals(KSimilarStrings().getSwapNumber(a, b), 2)
    }

    @Test
    fun test4() {
        val a = "aabc"
        val b = "abca"
        Assert.assertEquals(KSimilarStrings().getSwapNumber(a, b), 2)
    }

    @Test
    fun test5() {
        val a = "adacb"
        val b = "bdaca"
        Assert.assertEquals(KSimilarStrings().getSwapNumber(a, b), 1)
    }

    @Test
    fun test6() {
        val a = "adacdcab"
        val b = "dbadacac"
        Assert.assertEquals(KSimilarStrings().getSwapNumber(a, b), 3)
    }
}



