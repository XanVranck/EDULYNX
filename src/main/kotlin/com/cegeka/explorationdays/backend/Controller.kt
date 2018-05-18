package com.cegeka.explorationdays.backend

import com.cegeka.explorationdays.backend.item.Item
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.transaction.Transactional
import javax.validation.Valid

@Transactional
@RestController
class Controller {

    @Autowired
    private lateinit var eduLynxService: EduLynxService

    @PostMapping("/items/add")
    @CrossOrigin()
    fun createNewItem(@Valid @RequestBody item: Item): Unit = eduLynxService.saveItem(item)

    @GetMapping("/items/{id}")
    fun getItemById(@PathVariable(value = "id") itemId: Long): Optional<Item> {
        return eduLynxService.findById(itemId)
    }

    @PutMapping("/items/{id}")
    fun updateItemById(@PathVariable(value = "id") itemId: Long, @Valid @RequestBody newItem: Item) {
        val item = eduLynxService.findById(itemId)
        //update item
        eduLynxService.updateItemById(newItem)
    }

    @DeleteMapping("/items/{id}")
    fun deleteItemBy(@Valid @RequestBody itemToDelete: Item): Unit = eduLynxService.deleteItem(itemToDelete)

    @GetMapping("/items")
    @CrossOrigin
    fun getAllItems(): MutableList<Any?>? {
        return eduLynxService.getAllItems()
    }

}