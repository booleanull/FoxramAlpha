package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import javafx.util.converter.BigIntegerStringConverter
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N7Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return mulriplyNaturalWithTen(Natural(solution.number1), solution.digit).toString()
    }

    fun mulriplyNaturalWithTen(number1: Natural, digit: Int): Natural {
        val stringBuilder = StringBuilder()
        for(i in 0..(digit - 1)) {
            stringBuilder.append('0')
        }

        val value = number1.value.toString() + stringBuilder.toString()
        val bigIntegerStringConverter = BigIntegerStringConverter()

        return Natural(bigIntegerStringConverter.fromString(value))
    }
}