package subtask6

class Fibonacci {

    // TODO: Upgrade this solution
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var fib2 = 1
        var fib1 = 1
        var fib: Int
        for (i in 3..n) {
            if (fib2 * fib1 == n)
                return intArrayOf(fib2, fib1, 1)
            else if (fib2 * fib1 > n)
                break
            fib = fib1 + fib2
            fib2 = fib1
            fib1 = fib
        }
        return intArrayOf(fib2, fib1, 0)
    }
}
