package solution.nmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import solution.base.BaseSolution
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class N4Solution: BaseSolution, NModule {

    @Inject
    lateinit var n1Solution: N1Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return plusNaturalWithNatural(solution.number1, solution.number2)
    }

    fun plusNaturalWithNatural(number1: String, number2: String): String {
        val stringBuilder = StringBuilder()

        val max: Int
        val min: Int
        val maxItem: Boolean

        var num: Int
        var mod: Int
        var div = 0

        val num1 = number1.reversed()
        val num2 = number2.reversed()

        if(n1Solution.compareNaturalNumbers(number1, number2) == true) {
            max = number1.length - 1
            min = number2.length - 1
            maxItem = false
        } else {
            max = number2.length - 1
            min = number1.length - 1
            maxItem = true
        }

        with(stringBuilder) {
            for(i in 0..max) {
                num = if(i <= min) {
                    num1[i].toString().toInt() + num2[i].toString().toInt() + div
                } else if(i > min && !maxItem) {
                    num1[i].toString().toInt() + div
                } else {
                    num2[i].toString().toInt() + div
                }

                if(num >= 10) {
                    div = num / 10
                    append(num % 10)
                }
                else {
                    div = 0
                    append(num)
                }
            }
        }

        var result = stringBuilder.toString().reversed()
        if(div != 0) {
            result = "$div$result"
        }

        return result
    }
}