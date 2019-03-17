package solution.base

import controllers.solution.models.Solution

/**
@author boolenull on 17.03.2019
 */

interface BaseSolution {

    fun makeResult(solution: Solution): String
}