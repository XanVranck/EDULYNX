package com.cegeka.explorationdays.backend.item

import com.cegeka.explorationdays.backend.beoordeling.Beoordeling
import com.cegeka.explorationdays.backend.niveau.Niveau
import com.cegeka.explorationdays.backend.tags.Tags
import javax.persistence.*

@Entity
@Table(name = "Item")
@Access(AccessType.FIELD)
class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "naam")
    var naam: String = ""

    @Column(name = "type")
    var type: ItemType = ItemType.ARTIKEL

    @Column(name = "links")
    var links: String = ""

    @Column(name = "technologie")
    var technologiën: String = ""

    @Column(name = "niveau")
    var niveau: Niveau = Niveau.JUNIOR
//
//    @Column(name = "beoordelingen")
//    var beoordelingen: Beoordeling? = null

    @Column(name = "omschrijving")
    var omschrijving: String = ""


    constructor() {}

    constructor(naam: String, type: ItemType, links: String, technologie: String, niveau: Niveau, omschrijving: String) {
        this.id = 0
        this.naam = naam
        this.type = type
        this.links = links
        this.technologiën = technologie
        this.niveau = niveau
//        this.beoordelingen = beoordeling
        this.omschrijving = omschrijving
    }



}