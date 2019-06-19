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
        var count = -1
        val num = StringBuilder()
        var strwi = number.replace(" ", "").replace("-", "+-")
        if(strwi[0] == '+') strwi = strwi.substring(1, strwi.length)
        strwi.split("+").forEach {
            if(!it.contains("x")) {
                if(count != -1) {
                    for(i in 1..count) {
                        num.append("0/1 ")
                    }
                }
                count = -2
                if(!it.contains("/")) {
                    num.append("$it/1 ")
                }
                else {
                    num.append("$it ")
                }
            }
            else if(!it.contains("^")) {
                if(count != -1) {
                    for(i in 2..count) {
                        num.append("0/1 ")
                    }
                }
                count = 0
                var str = it.substring(0, it.length - 1)
                if(str.isEmpty()) str = "1/1"
                if(str == "-") str = "-1/1"
                if(!str.contains("/")) {
                    num.append("$str/1 ")
                }
                else {
                    num.append("$str ")
                }
            }
            else {
                val part = it.split("x^")
                if(count != -1) {
                    for(i in part[1].toInt() + 1..count) {
                        num.append("0/1 ")
                    }
                }
                count = part[1].toInt() - 1
                if(!it.contains("/")) {
                    when {
                        part[0].isEmpty() -> num.append("1/1 ")
                        part[0] == "-" -> num.append("-1/1 ")
                        else -> num.append("${part[0]}/1 ")
                    }
                }
                else {
                    num.append("${part[0]} ")
                }
            }
        }
        if(count != 2) {
            for(i in 0..count) {
                num.append("0/1 ")
            }
        }
        return num.toString().substring(0, num.length - 1)
    }

    fun convertToNewFormat(number: String): String {
        val result = StringBuilder()

        // Clear first values from null
        val numberWithNulls = number.split(" ").toMutableList()

        if(numberWithNulls.isEmpty()) return "0"

        while(numberWithNulls.first() == "0/1") {
            numberWithNulls.removeAt(0)
            if(numberWithNulls.isEmpty()) return "0"
        }

        numberWithNulls.forEachIndexed { index, string ->
            // We must don`t add null arguments
            if(string != "0/1") {
                val degree = numberWithNulls.size - 1 - index

                // Sign block
                var absNumber = string
                if(string.contains("-")) {
                    absNumber = string.replace("-", "")
                    result.append("- ")
                }
                else {
                    // Check on first argument
                    if(index != 0) {
                        result.append("+ ")
                    }
                }

                // Check special case - (Z)
                val qNumber = absNumber.split("/")
                if(absNumber.isNotEmpty()) {
                    if(qNumber[1] == "1") {
                        result.append("${qNumber[0]}x^{$degree} ")
                    }
                    else {
                        result.append("\\frac{${qNumber[0]}}{${qNumber[1]}}x^{$degree} ")
                    }
                }
            }
        }

        val resultString = result.toString().replace("1x^{0}", "1").replace("x^{0}", "").replace("1x^{1} ", "x ").replace("x^{1} ", "x ").replace("1x", "x")

        return if(resultString.isNotEmpty()) {
            resultString.removeRange(resultString.length - 1, resultString.length)
        }
        else {
            resultString
        }
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