package com.cegeka.explorationdays.backend

import com.cegeka.explorationdays.backend.item.Item
import com.cegeka.explorationdays.backend.technologie.Technologie
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*
import javax.persistence.EntityManager

@Repository
class EduLynxRepository {

    @Autowired
    private lateinit var entityManager: EntityManager

    fun getAllItems(): MutableList<Any?>? {
        return entityManager.createQuery("select t from Item t")?.resultList
    }

    fun saveItem(item: Item) {
        entityManager.persist(item)
    }

    fun findItemById(itemId: Long): Optional<Item> =
         Optional.ofNullable(entityManager.getReference(Item::class.java, itemId))

    fun updateItem(newItem: Item){
        entityManager.merge(newItem)
    }

    fun deleteItemById(item: Item) {
        entityManager.remove(item)
    }

}