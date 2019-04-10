package managers.form

import com.google.gson.Gson
import daggerServerComponent
import managers.form.models.Form
import javax.inject.Inject

/**
@author boolenull on 23.03.2019
 */

class FormGenerator {

    @Inject
    lateinit var gson: Gson

    init {
        daggerServerComponent.inject(this)
    }

    companion object {
        var forms: List<Form>? = null
    }

    fun generate(type: String): Form? {
        var form: Form? = null
        forms?.forEach { if(it.type == type) form = it }
        return form
    }
}