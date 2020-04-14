package subtask3

class Abbreviation {

    // TODO: Upgrade this solution
    fun abbreviationFromA(a: String, b: String): String {
        var done = false
        var j = 0
        for (c in b) {
            for (i in j + 1 until a.length) {
                if (c == a[i].toUpperCase()) {
                    j = i
                    done = true
                    break
                } else if (a[i].isUpperCase()) {
                    return "NO"
                }
            }
            if (!done) return "NO"
            done = false
        }
        return "YES"
    }
}
