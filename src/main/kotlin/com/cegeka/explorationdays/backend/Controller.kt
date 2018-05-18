package com.cegeka.explorationdays.backend

import com.cegeka.explorationdays.backend.item.Item
import com.cegeka.explorationdays.backend.technologie.Technologie
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.swing.text.html.Option
import javax.transaction.Transactional
import javax.validation.Valid

@Transactional
@RestController
@CrossOrigin(origins = arrayOf("http://localhost:4000","CI00031344:4000","CI00023215:4000", "CI00014637:4000", "MBP-van-Xan.cegekanv.corp.local:4000"), maxAge = 3000)
class Controller {

    @Autowired
    private lateinit var eduLynxService: EduLynxService

    @PostMapping("/items/add")
    fun createNewItem(@Valid @RequestBody item: Item): Unit = eduLynxService.saveItem(item)

    @GetMapping("/items/{id}")
    fun getItemById(@PathVariable(value = "id") itemId: Long): Optional<Item> {
        return eduLynxService.findById(itemId)
    }

    @PutMapping("/items/{id}")
    fun updateItemById(@PathVariable(value = "id") itemId: Long, @Valid @RequestBody newItem: Item) {
//        val item = eduLynxService.findById(itemId)
//        //update item
        eduLynxService.updateItemById(newItem)
    }

    @DeleteMapping("/items/{id}")
    fun deleteItemBy(@Valid @RequestBody itemToDelete: Item): Unit = eduLynxService.deleteItem(itemToDelete)


    @GetMapping("/items")
    fun getAllItems(): MutableList<Any?>? {
        return eduLynxService.getAllItems()
    }

}