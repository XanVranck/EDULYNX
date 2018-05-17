package com.cegeka.explorationdays.backend

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.Query

@Repository
class EduLynxRepository {

    @Autowired
    private lateinit var entityManager: EntityManager

    fun insertIntoDb(value: TestJava) {

        entityManager.persist(value);

    }

    fun getAllTests(): MutableList<Any?>? {
        return entityManager.createQuery("select t from TestJava t").resultList

    }
}