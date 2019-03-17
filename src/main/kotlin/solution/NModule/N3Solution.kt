package solution.nmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 17.03.2019
 */

class N3Solution: BaseSolution, NModule {

    override fun makeResult(solution: Solution): String {
        return plusNaturalWithNull(solution.number1)
    }

    fun plusNaturalWithNull(number1: String): String {
        val stringBuilder = StringBuilder()
        var inc = true

        with(stringBuilder) {
            for(i in (number1.length - 1) downTo 0) {
                if(inc) {
                    if(number1[i] == '9') {
                        append('0')
                    } else {
                        append(number1[i].toString().toInt() + 1)
                        inc = false
                    }
                }
                else {
                    append(number1[i])
                }
            }
        }

        var result = stringBuilder.toString().reversed()
        if(inc) {
            result = "1$result"
        }

        return result
    }
}