package ru.chesromakhin.crossgress.movement.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.movement.entity.Movement
import ru.chesromakhin.crossgress.movement.repository.MovementRepository

@Service
class MovementServiceImpl(
        val movementRepository: MovementRepository
) : MovementService {

    override fun getByKey(key: String): Mono<Movement> {
        return movementRepository.findByKey(key)
    }

    override fun save(movement: Movement): Mono<Movement> {
        return movementRepository.save(movement)
    }

}
