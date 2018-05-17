package com.cegeka.explorationdays.backend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Query
import javax.transaction.Transactional

@Transactional
@RestController
class Controller {

    @Autowired
    private lateinit var eduLynxService: EduLynxService

    @GetMapping("/exploration-days-backend")
    @CrossOrigin()
    fun helloworld(): String {
        return "hello world"
    }


    @PostMapping("/post")
    @CrossOrigin()
    fun postingTest() {
        eduLynxService.postToDb("test")
    }

    @GetMapping("/getall")
    @CrossOrigin
    fun getAllTests(): MutableList<Any?>? {
        return eduLynxService.getAllTests()
    }

}