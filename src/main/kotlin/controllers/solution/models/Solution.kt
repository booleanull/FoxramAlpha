package controllers.solution.models

import com.google.gson.annotations.Expose

/**
@author boolenull on 17.03.2019
 */

data class Solution(@Expose
                    val type: String,
                    @Expose
                    val items: List<String>,
                    @Expose
                    val number: Int)