package ru.chesromakhin.crossgress.record.service

import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.record.entity.Record

interface RecordService {

    fun save(record: Record): Mono<Record>

}