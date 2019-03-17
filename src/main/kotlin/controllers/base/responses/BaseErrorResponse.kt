package controllers.base.responses

/**
@author boolenull on 17.03.2019
 */

open class BaseErrorResponse(error: String, httpStatus: Int): BaseResponse("error", error, httpStatus)