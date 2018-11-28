package ru.chesromakhin.crossgress.movement.service

import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.movement.entity.Movement

interface MovementService {

    /**
     * Get movement by key
     */
    fun getByKey(key: String): Mono<Movement>

    fun save(movement: Movement): Mono<Movement>

}
