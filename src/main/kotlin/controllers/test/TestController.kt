package controllers.test

import com.google.gson.Gson
import controllers.base.BaseController
import controllers.test.models.TestRequest
import controllers.test.responses.TestOkResponse
import daggerServerComponent
import spark.Spark
import spark.Spark.post
import javax.inject.Inject

/**
@author boolenull on 17.03.2019
 */

class TestController: BaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerServerComponent.inject(this)
    }

    override fun start() {
        println("TestController is enabled")
        initTestPostResponse()
        initTestStart()
    }

    private fun initTestPostResponse() {
        post("/api/test", { req, res ->
            val data = gson.fromJson(req.body(), TestRequest::class.java)

            val stringToReturn = "You got from server ${data.message}"
            TestOkResponse(stringToReturn)
        }, gson::toJson)
    }

    private fun initTestStart() {
        Spark.get("/", { req, res ->
            "Hello"
        }, gson::toJson)
    }
}