package controllers.solution.responses

import controllers.base.responses.BaseErrorResponse

/**
@author boolenull on 17.03.2019
 */

class SolutionErrorResponse(error: String): BaseErrorResponse(error, 401)