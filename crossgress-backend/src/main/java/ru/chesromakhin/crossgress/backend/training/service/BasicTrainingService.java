package ru.chesromakhin.crossgress.backend.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.chesromakhin.crossgress.backend.training.model.Training;
import ru.chesromakhin.crossgress.backend.training.repository.TrainingRepository;

@Service
public class BasicTrainingService implements TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    @Override
    public Mono<Training> getTraining(String id) {
        return trainingRepository.findById(id);
    }
}
