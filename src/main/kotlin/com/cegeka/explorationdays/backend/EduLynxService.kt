package com.cegeka.explorationdays.backend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.persistence.Query

@Service
class EduLynxService {

    @Autowired
    private lateinit var repository:EduLynxRepository

        fun postToDb(value: String){
            var test=TestJava(value)
        repository.insertIntoDb(test)
    }

    fun getAllTests(): MutableList<Any?>? {
    return repository.getAllTests()
    }
}