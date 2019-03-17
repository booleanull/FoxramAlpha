package controllers.base.responses

import com.google.gson.annotations.Expose

/**
@author boolenull on 17.03.2019
 */

open class BaseResponse(@Expose
                        val status: String,
                        @Expose
                        val error: String? = null,
                        @Expose(serialize = false)
                        val httpStatus: Int)
