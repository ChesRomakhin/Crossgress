package ru.chesromakhin.crossgress.movement.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.movement.entity.Movement

interface MovementRepository: ReactiveCrudRepository<Movement, String> {

    fun findByKey(key: String): Mono<Movement>

}
