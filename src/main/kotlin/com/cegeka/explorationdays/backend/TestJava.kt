package com.cegeka.explorationdays.backend

import javax.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "TEST")
class TestJava {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0
    @Column(name = "timestamp")
    var timestamp: Timestamp? = null
    @Column(name = "input")
    var input: String = ""

    constructor() {}

    constructor(value: String) {
        this.timestamp = null
        this.input = value
    }
}
