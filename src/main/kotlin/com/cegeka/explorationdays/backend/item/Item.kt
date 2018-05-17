package com.cegeka.explorationdays.backend.item

import com.cegeka.explorationdays.backend.beoordeling.Beoordeling
import com.cegeka.explorationdays.backend.niveau.Niveau
import com.cegeka.explorationdays.backend.tags.Tags
import javax.persistence.*

@Entity
@Table(name = "Item")
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
    var links: List<String>? = null

    @Column(name = "technologie")
    var technologiën: List<Tags>? = null

    @Column(name = "niveau")
    var niveau: Niveau = Niveau.JUNIOR

    @Column(name = "beoordelingen")
    var beoordelingen: Beoordeling? = null

    @Column(name = "thumbnail")
    var thumbnail: Byte? = null

    @Column(name = "omschrijving")
    var omschrijving: String = ""


    constructor() {}

    constructor(naam: String, type: ItemType, links: List<String>, technologie: List<Tags>, niveau: Niveau, beoordeling: Beoordeling, thumbnail: Byte, omschrijving: String) {
        this.naam = naam
        this.type = type
        this.links = links
        this.technologiën = technologie
        this.niveau = niveau
        this.beoordelingen = beoordeling
        this.thumbnail = thumbnail
        this.omschrijving = omschrijving
    }



}