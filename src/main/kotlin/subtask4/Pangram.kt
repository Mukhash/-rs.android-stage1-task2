package subtask4

class Pangram {

    // TODO: Upgrade this solution
    fun getResult(inputString: String): String {
        var count = 0
        val vowels = listOf("a", "e", "i", "o", "u", "y")
        val cons = listOf("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z",
            "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z" )
        val lettersMap = hashMapOf<String, Int>()
        var i = 0
        val lowerInput = inputString.toLowerCase()
        for (letter in lowerInput) {
            if (letter.isLetter()) {
                lettersMap[letter.toString()] = lettersMap.getOrPut(letter.toString(), { 0 })
            }
        }
        if (lettersMap.size == 26) {

            val list = inputString.split(" ")
            val resList = mutableListOf<String>()
            val resList2 = mutableListOf<String>()
            var resList3 = mutableListOf<String>()

            for (str in list) {
                count = 0
                for (char in str) {
                    if (char.toString() in vowels) {
                        count += 1
                    }
                }
                if (str != "") {
                    resList.add(count.toString())
                    resList.add(str)
                }
            }

            while (i <= resList.size - 4) {
                if (resList[i].toInt() > resList[i + 2].toInt()) {
                    var temp = resList[i + 2]
                    var temp2 = resList[i + 3]
                    resList[i + 2] = resList[i]
                    resList[i + 3] = resList[i + 1]
                    resList[i] = temp
                    resList[i + 1] = temp2
                    i = 0
                } else {
                    i += 2
                }
            }

            for (i in 0..resList.size - 2 step 2) {
                resList2.add(resList[i] + resList[i + 1])
            }
            val joined = resList2.joinToString(" ")
            val joinedList = joined.split("") as MutableList<String>
            val lastRes = ArrayList<String>()
            for (letter in joinedList) {
                if (vowels.contains(letter)) {
                    lastRes.add(letter.toUpperCase())
                } else {
                    lastRes.add(letter)
                }
            }
            return lastRes.joinToString("")

        } else {
            val list = inputString.split(" ")
            val resList = mutableListOf<String>()
            val resList2 = mutableListOf<String>()

            for (str in list) {
                count = 0
                for (char in str) {
                    if (char.toString() in cons) {
                        count += 1
                    }
                }
                if (str != "" && str != "\n") {
                    resList.add(count.toString())
                    resList.add(str)
                }
            }

            while (i <= resList.size - 4) {
                if (resList[i].toInt() > resList[i + 2].toInt()) {
                    var temp = resList[i + 2]
                    var temp2 = resList[i + 3]
                    resList[i + 2] = resList[i]
                    resList[i + 3] = resList[i + 1]
                    resList[i] = temp
                    resList[i + 1] = temp2
                    i = 0
                } else {
                    i += 2
                }
            }

            for (i in 0..resList.size - 2 step 2) {
                resList2.add(resList[i] + resList[i + 1])
            }
            val joined = resList2.joinToString(" ")
            val joinedList = joined.split("") as MutableList<String>
            val lastRes = ArrayList<String>()
            for (letter in joinedList) {
                if (cons.contains(letter)) {
                    lastRes.add(letter.toUpperCase())
                } else {
                    lastRes.add(letter)
                }
            }
            return lastRes.joinToString("")
        }
    }
}
