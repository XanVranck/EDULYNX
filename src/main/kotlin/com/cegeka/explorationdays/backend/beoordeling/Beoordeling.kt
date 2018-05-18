package com.cegeka.explorationdays.backend.beoordeling

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "BEOORDELING")
class Beoordeling {

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