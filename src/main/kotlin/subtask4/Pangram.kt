package subtask4

class Pangram {

    // TODO: Upgrade this solution
    fun getResult(inputString: String): String {
        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
        val list = if (('a'..'z').none { it !in inputString.toLowerCase() })
            vowels else ('a'..'z') - vowels
        val resultList = inputString
            .replace("\n", " ")
            .split(" ")
            .sortedBy { word -> word.count { it.toLowerCase() in list } }
            .toMutableList()
        resultList.removeAll { it == " " || it == "" }
        resultList.forEachIndexed { index, string ->
            resultList[index] = "${string.count{ it.toLowerCase() in list }}$string"
            val x = resultList[index].toCharArray()
            x.forEachIndexed { i, c ->
                if (c in list && c.isLowerCase()) x[i] = c.toUpperCase()
            }
            resultList[index] = x.joinToString("")
        }
        return resultList.joinToString(" ")
    }
}
