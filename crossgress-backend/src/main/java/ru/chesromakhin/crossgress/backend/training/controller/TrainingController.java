package ru.chesromakhin.crossgress.backend.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.chesromakhin.crossgress.backend.training.model.Training;
import ru.chesromakhin.crossgress.backend.training.service.TrainingService;

@RequestMapping(value = "/training", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/{id}")
    public Mono<Training> getTraining(@PathVariable("id") String id) {
        return trainingService.getTraining(id);
    }

}
