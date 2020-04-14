package subtask2

class TimeConverter {

    // TODO: Upgrade this solution
    fun toTextFormat(hour: String, minute: String): String {
        val intHour = hour.toInt()
        val intMinute = minute.toInt()
        val map = mutableMapOf(
            1 to "one", 2 to "two", 3 to "three", 4 to "four",
            5 to "five", 6 to "six", 7 to "seven", 8 to "eight",
            9 to "nine", 10 to "ten", 11 to "eleven", 12 to "twelve",
            13 to "thirteen", 14 to "fourteen", 15 to "fifteen", 16 to "sixteen",
            17 to "seventeen", 18 to "eighteen", 19 to "nineteen", 20 to "twenty"
        )
        for (i in 21..29)
            map[i] = "twenty ${map[i - 20]}"

        return when (intMinute) {
            0 -> "${map[intHour]} o' clock"
            1 -> "one minute past ${map[intHour]}"
            15 -> "quarter past ${map[intHour]}"
            30 -> "half past ${map[intHour]}"
            45 -> "quarter to ${map[intHour + 1]}"
            59 -> "one minute to ${map[intHour + 1]}"
            in 2..29 -> "${map[intMinute]} minutes past ${map[intHour]}"
            in 31..58 -> "${map[60 - intMinute]} minutes to ${map[intHour + 1]}"
            else -> ""
        }
    }
}
