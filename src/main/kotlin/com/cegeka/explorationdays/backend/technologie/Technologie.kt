package com.cegeka.explorationdays.backend.technologie

import javax.persistence.*

@Entity
@Table(name = "TECHNOLOGIE")
class Technologie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id: Int = 0

    @Column(name = "TECHNOLOGIE")
    var naam: String = ""

    constructor()

    constructor(naam: String) {
        this.naam = naam
    }
}
