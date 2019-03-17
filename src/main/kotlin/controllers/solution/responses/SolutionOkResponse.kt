package controllers.solution.responses

import com.google.gson.annotations.Expose
import controllers.base.responses.BaseOkResponse

/**
@author boolenull on 17.03.2019
 */

class SolutionOkResponse(@Expose
                         val result: String): BaseOkResponse()