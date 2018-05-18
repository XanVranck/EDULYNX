package com.cegeka.explorationdays.backend.item

import com.cegeka.explorationdays.backend.beoordeling.Beoordeling
import com.cegeka.explorationdays.backend.links.Link
import com.cegeka.explorationdays.backend.niveau.Niveau
import com.cegeka.explorationdays.backend.tags.Tags
import com.cegeka.explorationdays.backend.technologie.Technologie
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "ITEM")
@Access(AccessType.FIELD)
class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id: Int = 0

    @Column(name = "NAAM")
    var naam: String = ""

    @Column(name = "TYPE")
    var type: ItemType = ItemType.ARTIKEL

    @OneToMany(cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
    @JoinColumn(name = "LINKS_ID", nullable = false)
    var links: List<Link> = emptyList()

    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
    @JoinColumn(name = "TECHNOLOGIE_ID", nullable = false)
    var technologiën: List<Technologie> = emptyList()

    @Column(name = "NIVEAU")
    var niveau: Niveau = Niveau.JUNIOR

    @OneToMany(cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
    @JoinColumn(name = "BEOORDELING_ID", nullable = true)
    var beoordelingen: Beoordeling? = null

    @Column(name = "OMSCHRIJVING")
    var omschrijving: String = ""


    constructor() {}

    constructor(naam: String, type: ItemType, links: List<Link>, technologie: List<Technologie>, niveau: Niveau, omschrijving: String, beoordeling: Beoordeling?) {
        this.naam = naam
        this.type = type
        this.links = links
        this.technologiën = technologie
        this.niveau = niveau
        this.beoordelingen = beoordeling
        this.omschrijving = omschrijving
    }



}