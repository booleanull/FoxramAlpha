package managers.solution.pmodule

import Utils.toStringList
import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q5Solution
import javax.inject.Inject

/**
@author Максим Нигматулин
 */

class P1Solution: BaseSolution, PModule {

    @Inject
    lateinit var q5Solution: Q5Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        return convertToNewFormat(plusPolynomialWithPolynomial(convertToOlderFormat(solution.number1), convertToOlderFormat(solution.number2)))
    }

    fun convertToOlderFormat(number: String): String {
        var num1 = "0/1"
        number.split(" ").forEach {
            val num = it.split("x^", "x")
            val stringBuilder = StringBuilder()
            stringBuilder.append(num[0])
            if(num.size > 1) {
                if(num[1].isEmpty()) {
                    stringBuilder.append(" 0/1")
                }
                else {
                    for(i in 0 until num[1].toInt()) {
                        stringBuilder.append(" 0/1")
                    }
                }
            }
            num1 = plusPolynomialWithPolynomial(num1, stringBuilder.toString())
        }
        println(num1)
        return num1
    }

    fun convertToNewFormat(number: String): String {
        val stringBuilder = StringBuilder()

        val list = number.split(" ")
        list.forEachIndexed { index, s ->
            if(s != "0/1") {
                val ind = list.size - index
                stringBuilder.append(s)
                if(ind == 2) {
                    stringBuilder.append("x")
                }
                else if(ind >= 3) {
                    stringBuilder.append("x^")
                    stringBuilder.append(ind - 1)
                }
                stringBuilder.append(" ")
            }
        }
        if(stringBuilder.isEmpty()) {
            stringBuilder.append("0/1 ")
        }
        return stringBuilder.substring(0, stringBuilder.length - 1).toString()
    }

    fun plusPolynomialWithPolynomial(number1: String, number2: String): String {
        var num1 = number1.split(" ").toMutableList()
        var num2 = number2.split(" ").toMutableList()

        if(num1.size < num2.size) {
            val temp = num1
            num1 = num2
            num2 = temp
        }

        num2.forEachIndexed { index, it ->
            num1[num1.size - num2.size + index] = q5Solution.plusFractionWithFraction(num1[num1.size - num2.size + index], it)
        }

        return num1.toStringList()
    }
}