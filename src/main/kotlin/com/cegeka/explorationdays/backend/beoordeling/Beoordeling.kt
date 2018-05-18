package com.cegeka.explorationdays.backend.beoordeling

import javax.persistence.*

@Entity
@Table(name = "BEOORDELING")
class Beoordeling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "rating")
    var rating: Double = 0.0

    @Column(name = "comment")
    var comment: String = ""

    constructor() {}

    constructor(rating: Double, comment: String) {
        this.rating = rating
        this.comment = comment
    }
}