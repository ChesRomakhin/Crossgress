package ru.chesromakhin.crossgress.backend.training.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Document(collection = "training")
public class Training {

    @Id
    private String id;

    private String name;
    private TrainingMode mode;
    private Map<String, List<String>> parts;

}
