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

    fun generate(type: String): Form? {
        var form: Form? = null
        try {
            val formText = String::class.java.getResource("/forms.json").readText()
            val forms = gson.fromJson(formText, Array<Form>::class.java)
            forms.forEach { if(it.type == type) form = it }
        } catch(e: Exception) {
            println("Can't load file")
        }
        return form
    }
}