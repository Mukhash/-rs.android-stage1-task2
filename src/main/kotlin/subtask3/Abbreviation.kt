package subtask3

class Abbreviation {

    // TODO: Upgrade this solution
    fun abbreviationFromA(a: String, b: String): String {

        val upperA = a.toUpperCase()
        var tempIndex = 0

        for (charB in b) {
            for (i in tempIndex until upperA.length) {
                if (upperA[i] == charB) {
                    tempIndex = i+1
                    break
                }
                if (i == a.length-1 && i != tempIndex) { return "NO" }
            }
        }
        return "YES"
    }
}
