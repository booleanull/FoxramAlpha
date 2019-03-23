package controllers.solution.responses

import com.google.gson.annotations.Expose
import controllers.base.responses.BaseOkResponse
import managers.form.models.Form

/**
@author boolenull on 17.03.2019
 */

class FormOkResponse(@Expose
                     val form: Form): BaseOkResponse()