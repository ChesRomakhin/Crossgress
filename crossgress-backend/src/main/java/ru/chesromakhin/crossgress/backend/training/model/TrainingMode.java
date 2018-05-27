package ru.chesromakhin.crossgress.backend.training.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "trainingMode")
public class TrainingMode {

    @Id
    private String id;
    private String name;
    private String text;
    private String description;

}
