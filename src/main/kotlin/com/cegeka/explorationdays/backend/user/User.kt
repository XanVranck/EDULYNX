package com.cegeka.explorationdays.backend.user

import com.cegeka.explorationdays.backend.item.Item
import com.cegeka.explorationdays.backend.tags.Tags
import javax.persistence.*

@Entity
@Table(name = "User")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "naam")
    var naam: String = ""

    @Column(name = "leeftijd")
    var leeftijd: Int = 0

    @Column(name = "email")
    var email: String = ""

    @Column(name = "interesses")
    var interesses: List<Tags>? = null

    @Column(name = "favorieten")
    var favorieten: List<Item>? = null

    constructor() {}

    constructor(naam: String, leeftijd: Int, email: String, interesses: List<Tags>?, favorieten: List<Item>?) {
        this.naam = naam
        this.leeftijd = leeftijd
        this.email = email
        this.interesses = interesses
        this.favorieten = favorieten
    }

}
