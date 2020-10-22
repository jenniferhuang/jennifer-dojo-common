package jennifer.dojo.common.bestvalue

import org.junit.Assert
import org.junit.Test


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

    /**
    i=0  sum= 0
    i=1  sum= 3
    i=2  sum= 6
    i=3  sum= 9
    i=4  sum= 11
    i=5  sum= 12 = ()
    i=6  sum= 13
    i=7  sum= 14
    i=8  sum= 15
    i=9  sum= 16
     **/


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

        val arr = arrayOf(6, 2, 3)
//
        val diffValueList: MutableList<Int> = mutableListOf<Int>(2, 3, 4)

//
//
//        println("1111`1" )
//        println("lllllxp" + diffValueList)
//        println("1222" )
////
//        val a:Int =1
//        val b:Int =2
//        println(a==b)
//        println(a.equals(b))

//        println(diffValueList[0])
//        val neastIndexList1 = arr.indices.filter { i: Int -> diffValueList[i]==2 }.toList()
        val neastIndexList2 = arr.indices.filter { i: Int ->
            val a = diffValueList[i]
            a.equals(2)
        }.toList()
    }
}