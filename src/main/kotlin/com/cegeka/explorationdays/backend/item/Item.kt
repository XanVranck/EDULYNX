package com.cegeka.explorationdays.backend.item

import com.cegeka.explorationdays.backend.beoordeling.Beoordeling
import com.cegeka.explorationdays.backend.links.Link
import com.cegeka.explorationdays.backend.niveau.Niveau
import com.cegeka.explorationdays.backend.technologie.Technologie
import javax.persistence.*

@Entity
@Table(name = "ITEM")
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
    @JoinColumn(name = "FK_ITEM_ID", nullable = false)
    var links: List<Link> = emptyList()

    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
    @JoinTable(name="ITEM_TECHNOLOGIE")
    var technologies: List<Technologie> = emptyList()

    @Column(name = "NIVEAU")
    var niveau: Niveau = Niveau.JUNIOR

    @OneToMany(cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
    @JoinColumn(name = "FK_ITEM_ID", nullable = true)
    var beoordelingen: List<Beoordeling> = emptyList()

    @Column(name = "OMSCHRIJVING")
    var omschrijving: String = ""


    constructor() {}

    constructor(naam: String, type: ItemType, links: List<Link>, technologies: List<Technologie>, niveau: Niveau, omschrijving: String, beoordeling: List<Beoordeling>) {
        this.naam = naam
        this.type = type
        this.links = links
        this.technologies = technologies
        this.niveau = niveau
        this.beoordelingen = beoordeling
        this.omschrijving = omschrijving
    }



}