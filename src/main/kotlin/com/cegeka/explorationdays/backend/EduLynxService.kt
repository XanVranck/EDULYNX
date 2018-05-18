package com.cegeka.explorationdays.backend

import com.cegeka.explorationdays.backend.beoordeling.Beoordeling
import com.cegeka.explorationdays.backend.item.Item
import com.cegeka.explorationdays.backend.item.ItemType
import com.cegeka.explorationdays.backend.niveau.Niveau
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class EduLynxService {

    @Autowired
    private lateinit var repository: EduLynxRepository

    fun getAllItems(): MutableList<Any?>? {
        return repository.getAllItems()
    }

    fun saveItem(item: Item) {
        repository.saveItem(item)
    }

    fun findById(itemId: Long): Optional<Item> {
        return repository.findItemById(itemId)
    }

    fun updateItemById(newItem: Item) {
        repository.updateItem(newItem)
    }

    fun deleteItem(item: Item) {
        repository.deleteItemById(item)
    }

    fun getDummyItems():  MutableList<Any?>?{
        val links: String = "www.google.com"
        val links1: String = "www.retie.be"
        val links2: String = "https://spring.io/blog/2017/01/04/introducing-kotlin-support-in-spring-framework-5-0"
        val technologie: String = "Dark matters"
        val technologie1: String = "Retie underground"
        val technologie2: String = "Spring"
        val item1 = Item("How to save the world", ItemType.BOEK, links, technologie, Niveau.WIZARD, "Did you google it")
        val item2 = Item("Retie for dummies as told by wim ", ItemType.ARTIKEL, links1, technologie1, Niveau.WIM,  "Scifi")
        val item3 = Item("Spring Kotlin", ItemType.BOEK, links2, technologie2, Niveau.WIZARD,  "waauww")

        return mutableListOf(item1, item2, item3)
    }
}