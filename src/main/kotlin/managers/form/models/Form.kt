package managers.form.models

import com.google.gson.annotations.Expose

/**
@author boolenull on 23.03.2019
 */

data class Form(@Expose
                val type: String,
                @Expose
                val number1: Boolean,
                @Expose
                val number2: Boolean,
                @Expose
                val digit: Boolean,
                @Expose
                val description: String)