package com.cegeka.explorationdays.backend.links

import javax.persistence.*

@Entity
@Table(name = "LINK")
class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id: Int = 0

    @Column(name = "LINK")
    var naam: String = ""

    constructor()

    constructor(naam: String){
        this.naam = naam
    }

}