package jennifer.dojo.common.ksimilar

class KSimilarStrings {

    fun getSwapNumber(a: String, b: String): Int {
        if (a.length != b.length) {
            return -1
        }
        return getK(a.toMutableList(), b.toMutableList())
    }


    var k = 0

    fun getK(aList: MutableList<Char>, bList: MutableList<Char>): Int {
        removeCommonIndex(aList, bList)
        if (aList.size <= 1) return k
        if (aList.indexOf(bList[0]) == -1) {
            return -1
        } else {
            val index = findToSwapIndex(aList, bList)
            k = k + 1
            swapChars(aList, index)
            return getK(aList, bList) //recursion
        }
    }


    fun removeCommonIndex(aList: MutableList<Char>, bList: MutableList<Char>) {
        var index = 0
        while (index < aList.size) {
            if (aList[index] == bList[index]) {
                aList.removeAt(index)
                bList.removeAt(index)
            } else {
                index++
            }
        }
    }

    fun swapChars(aList: MutableList<Char>, index: Int) {
        val tempChar = aList[index]
        aList[index] = aList[0]
        aList[0] = tempChar
    }

    fun findToSwapIndex(aList: MutableList<Char>, bList: MutableList<Char>): Int {
        var allMatchedIndex = mutableListOf<Int>()
        for (index in aList.indices) {
            if (aList[index] == bList[0]) {
                allMatchedIndex.add(index)
            }
        }
        for (index in allMatchedIndex) {
            if (aList[0] == bList[index]) return index
        }
        return allMatchedIndex[0]
    }

}
