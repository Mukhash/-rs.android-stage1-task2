package subtask6

class Fibonacci {
    
    fun productFibonacciSequenceFor(n: Int): IntArray {

        val result = intArrayOf(0,0,0)
        var prod = 0
        var index = 2
        val fibList = mutableListOf<Int>()
        fibList.add(0)
        fibList.add(1)

        loop@ while (true) {
            fibList.add(fibList[index-1]+fibList[index-2])
            prod = fibList[index] * fibList[index-1]
            when {
                prod == n -> {
                    result[2] = 1
                    result[1] = fibList[index]
                    result[0] = fibList[index-1]
                    break@loop
                }
                prod > n -> {
                    result[2] = 0
                    result[1] = fibList[index]
                    result[0] = fibList[index-1]
                    break@loop
                }
                else -> {
                    index += 1
                }
            }
        }
        return result
    }
}
