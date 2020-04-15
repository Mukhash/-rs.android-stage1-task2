package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Upgrade this solution
    fun toTextDay(day: String, month: String, year: String): String {
        val mapOfMonths = hashMapOf("JANUARY" to "января", "FEBRUARY" to "февраля", "MARCH" to "марта", "APRIL" to "апреля",
            "MAY" to "мая", "JUNE" to "июня", "JULY" to "июля", "AUGUST" to "августа",
            "SEPTEMBER" to "сентября", "OCTOBER" to "октября", "NOVEMBER" to "ноября", "DECEMBER" to "декабря")
        val mapOfWeeks = hashMapOf("MONDAY" to "понедельник", "TUESDAY" to "вторник", "WEDNESDAY" to "среда", "THURSDAY" to "четверг",
            "FRIDAY" to "пятница", "SATURDAY" to "суббота", "SUNDAY" to "воскресенье")
        try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(
                DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))

            return date

        } catch (e: Exception) {
            return "Такого дня не существует"
        }
    }
}
