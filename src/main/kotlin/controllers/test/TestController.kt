package controllers.test

import com.google.gson.Gson
import controllers.base.BaseController
import controllers.test.models.TestRequest
import controllers.test.responses.TestOkResponse
import daggerApplicationComponent
import spark.Spark.post
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class TestController: BaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerApplicationComponent.inject(this)
    }

    override fun start() {
        println("TestController is enabled")
        initTestPostResponse()
    }

    private fun initTestPostResponse() {
        post("/api/test", { req, res ->
            val data = gson.fromJson(req.body(), TestRequest::class.java)

            val stringToReturn = "You got from server ${data.message}"
            TestOkResponse(stringToReturn)
        }, gson::toJson)
    }
}