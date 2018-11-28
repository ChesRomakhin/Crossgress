package ru.chesromakhin.crossgress.movement.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Movement {

    @Id
    var id: String? = null

    var key: String = ""

    var measures: List<Measure> = ArrayList()

}
