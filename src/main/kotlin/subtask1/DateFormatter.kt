package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Upgrade this solution
    fun toTextDay(day: String, month: String, year: String): String =
        if (!isDateValid(day.toInt(), month.toInt(), year.toInt()))
            "Такого дня не существует"
        else LocalDate.parse("$day-$month-$year", DateTimeFormatter.ofPattern("dd-M-yyyy"))
            .format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))

    private fun isDateValid(day: Int, month: Int, year: Int) = when {
        month > 12 -> false
        day > when (month) {
            4, 6, 9, 11 -> 30
            2 -> when (0) {
                year % 400 -> 29
                year % 100 -> 28
                year % 4 -> 29
                else -> 28
            }
            else -> 31
        } -> false
        else -> true
    }
}
