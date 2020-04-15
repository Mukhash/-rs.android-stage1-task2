package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    var str = ""
    var sum = 0
    var maxDate = LocalDate.MIN
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class ->
                for (item in blockA) {
                    if (item is String) {
                        str += item
                    }
                }
            Int::class ->
                for (item in blockA) {
                    if (item is Int) {
                        sum += item
                    }
                }
            LocalDate::class ->
                for (item in blockA) {
                    if (item is LocalDate) {
                        if (item > maxDate) {
                            maxDate = item
                        }
                    }
                }
            else -> ""
        }
        return when (blockB) {
            String::class -> str
            Int::class -> sum
            LocalDate::class -> maxDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            else -> ""
        }
    }
}
