package ru.chesromakhin.crossgress.backend.training.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ru.chesromakhin.crossgress.backend.training.model.Training;

@Repository
public interface TrainingRepository extends ReactiveCrudRepository<Training, String> {
}
