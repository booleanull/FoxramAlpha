package controllers.solution.responses

import controllers.base.responses.BaseResponse

/**
@author boolenull on 17.03.2019
 */

class SolutionResponse {

    fun build(result: String): BaseResponse {
        return when(result) {
            "Incorrect format" -> SolutionErrorResponse(result)
            else -> SolutionOkResponse(result)
        }
    }
}