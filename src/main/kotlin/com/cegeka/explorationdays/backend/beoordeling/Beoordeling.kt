package com.cegeka.explorationdays.backend.beoordeling

import javax.persistence.*

@Entity
@Table(name = "BEOORDELING")
class Beoordeling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id: Int = 0

    @Column(name = "RATING")
    var rating: Double = 0.0

    @Column(name = "COMMENT")
    var comment: String = ""

    constructor() {}

    constructor(rating: Double, comment: String) {
        this.rating = rating
        this.comment = comment
    }
}