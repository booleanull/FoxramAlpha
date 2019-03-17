package controllers.base.responses

/**
@author boolenull on 17.03.2019
 */

open class BaseOkResponse(httpStatus: Int = 200): BaseResponse("ok", httpStatus = httpStatus)