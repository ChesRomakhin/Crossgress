package ru.chesromakhin.crossgress.record.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.movement.service.MovementService
import ru.chesromakhin.crossgress.record.entity.Record
import ru.chesromakhin.crossgress.record.entity.RecordJson
import ru.chesromakhin.crossgress.record.service.RecordService

@RestController
@RequestMapping("/api/records")
class RecordController(
        val recordService: RecordService,
        val movementService: MovementService
) {

    @PostMapping
    fun create(@RequestBody recordJson: RecordJson): Mono<Record> {
        return movementService.getByKey(recordJson.movement)
                .flatMap {
                    val record = Record()
                    record.movement = it
                    record.user = "temp"
                    record.results = recordJson.results

                    recordService.save(record)
                }
    }

}