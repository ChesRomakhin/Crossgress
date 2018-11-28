package ru.chesromakhin.crossgress.record.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import ru.chesromakhin.crossgress.record.entity.Record
import ru.chesromakhin.crossgress.record.repository.RecordRepository

@Service
class RecordServiceImpl(
        val recordRepository: RecordRepository
) : RecordService {

    override fun save(record: Record): Mono<Record> {
        return recordRepository.save(record)
    }

}