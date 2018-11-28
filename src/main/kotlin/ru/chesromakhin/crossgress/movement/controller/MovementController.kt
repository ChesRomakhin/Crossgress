package ru.chesromakhin.crossgress.movement.controller

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.movement.entity.Movement
import ru.chesromakhin.crossgress.movement.service.MovementService

@RestController
@RequestMapping("/api/movements")
class MovementController(
        val movementService: MovementService
) {

    @GetMapping("/{key}")
    fun get(@PathVariable key: String): Mono<Movement> {
        return movementService.getByKey(key)
    }

    @PostMapping
    fun create(@RequestBody movement: Movement): Mono<Movement> {
        return movementService.save(movement)
    }

}
