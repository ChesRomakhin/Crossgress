package ru.chesromakhin.crossgress.record.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import ru.chesromakhin.crossgress.movement.entity.Movement

@Document
class Record {

    @Id
    var id: String? = null

    var user: String = ""

    @DBRef
    var movement: Movement? = null

    var results: Map<String, Any> = HashMap()

}