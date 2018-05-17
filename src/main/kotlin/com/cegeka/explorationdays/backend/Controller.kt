package com.cegeka.explorationdays.backend

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {


    @GetMapping("/exploration-days-backend")
    @CrossOrigin("http://localhost:4000")
    fun helloworld(): String {return "hello world"}


}