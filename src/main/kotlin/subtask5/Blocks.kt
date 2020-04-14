package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Upgrade this solution
    fun getData(blockA: Array<Any>, blockB: KClass<*>) = when (blockB) {
        String::class ->
            blockA.filterIsInstance<String>().joinToString("")
        Int::class ->
            blockA.filterIsInstance<Int>().sum()
        else ->
            blockA.filterIsInstance<LocalDate>().max()
                ?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    }
}
