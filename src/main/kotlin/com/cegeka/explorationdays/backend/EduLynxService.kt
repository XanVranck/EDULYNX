package com.cegeka.explorationdays.backend

import com.cegeka.explorationdays.backend.item.Item
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
}