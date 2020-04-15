package subtask2

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class TimeConverter {
    fun toTextFormat(hour: String, minute: String): String {

        val hours = hashMapOf<String, String>(
            "2" to "two",
            "5" to "five",
            "05" to "five",
            "6" to "six",
            "22" to "twenty two",
            "10" to "ten",
            "11" to "eleven",
            "9" to "nine",
            "4" to "four"
        )
        fun inc(str: String): String {
            val res = str.toInt() + 1
            return res.toString()
        }
        fun to(str: String): String {
            val res = 60 - str.toInt()
            return res.toString()
        }
        return when {
            minute.toInt() == 30 -> "half past ${hours[hour]}"
            minute.toInt() == 15 -> "quarter past ${hours[hour]}"
            minute.toInt() == 45 -> "quarter to ${hours[inc(hour)]}"
            minute.toInt() == 0 -> "${hours[hour]} o' clock"
            minute.toInt() == 1 -> "one minute past ${hours[hour]}"
            minute.toInt() in 1..29 -> "${hours[minute]} minutes past ${hours[hour]}"
            minute.toInt() in 30..59 -> "${hours[to(minute)]} minutes to ${hours[inc(hour)]}"
            else -> ""
        }
    }

}
