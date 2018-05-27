package ru.chesromakhin.crossgress.backend.training.service;

import reactor.core.publisher.Mono;
import ru.chesromakhin.crossgress.backend.training.model.Training;

public interface TrainingService {

    Mono<Training> getTraining(String id);

}
