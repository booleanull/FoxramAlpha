package managers.solution.pmodule

import controllers.solution.models.Solution
import daggerSolutionComponent
import managers.solution.base.BaseSolution
import managers.solution.qmodule.Q8Solution
import javax.inject.Inject

class P13Solution: BaseSolution, PModule {

    @Inject
    lateinit var q8Solution: Q8Solution
    @Inject
    lateinit var p1Solution: P1Solution
    @Inject
    lateinit var p2Solution: P2Solution
    @Inject
    lateinit var p8Solution: P8Solution
    @Inject
    lateinit var p9Solution: P9Solution
    @Inject
    lateinit var p10Solution: P10Solution
    @Inject
    lateinit var p6Solution: P6Solution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun makeResult(solution: Solution): String {
        val result = solutionEuclid(p1Solution.convertToOlderFormat(solution.number1), p1Solution.convertToOlderFormat(solution.number2))
        val builder = StringBuilder("${result[0].size};")
        result.map { list -> list.map { builder.append("${p1Solution.convertToNewFormat(it)};") } }
        return builder.toString()
    }

    /* Функция расширенного алгоритма Евклида,
     принимающая два многочлена, возвращающая таблицу */
    fun solutionEuclid(number1: String, number2: String): List<List<String>> {
        var num1: String
        var num2: String

        val factor = p6Solution.elderFactor(number1)
        val factor1 = p6Solution.elderFactor(number2)
        if(factor >= factor1) {
            num1 = number1
            num2 = number2
        }
        else {
            num1 = number2
            num2 = number1
        }

        // Заполняем таблицу первоначальными данными
        val top = mutableListOf(num1, num2)
        val bottom = mutableListOf("-", "-")
        val x = mutableListOf("1/1", "0/1")
        val y = mutableListOf("0/1", "1/1")

        /* Пока остаток от деления двух многочленов не равен 0 */
        while(top.last() != "0/1") {
            if(num1.split(" ").size > 1 || num2.split(" ").size > 1) {
                // Записываем остаток от деления
                top.add(p10Solution.remainderPolynomialWithPolynomial(num1, num2))
                // Записываем частное от деления
                bottom.add(p9Solution.divisionPolynomialWithPolynomial(num1, num2))
            }
            else {
                top.add(q8Solution.remainderFractionWithFraction(num1, num2))
                bottom.add(q8Solution.divisionAFractionWithFraction(num1, num2))
            }
            // Меняем местами значения
            num1 = num2
            num2 = top.last()
        }

        // Производим вычисления для нахождения x, y
        var i = 0
        bottom.forEach {
            if(it != "-") {
                x.add(p2Solution.minusPolynomialWithPolynomial(x[i], p8Solution.multiplyPolynomialWithPolynomial(x[i + 1], it)))
                y.add(p2Solution.minusPolynomialWithPolynomial(y[i], p8Solution.multiplyPolynomialWithPolynomial(y[i + 1], it)))
                i++
            }
        }

        return listOf(top, bottom, x, y)
    }
}