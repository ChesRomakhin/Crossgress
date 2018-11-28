package ru.chesromakhin.crossgress.record.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux
import ru.chesromakhin.crossgress.movement.entity.Movement
import ru.chesromakhin.crossgress.record.entity.Record

interface RecordRepository: ReactiveCrudRepository<Record, String> {

    fun findAllByMovementAndUser(movement: Movement, user: String): Flux<Record>

}