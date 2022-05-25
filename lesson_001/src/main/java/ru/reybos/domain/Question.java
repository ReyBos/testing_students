package ru.reybos.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({ "question", "answer"})
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Question {

    private String question;

    private String answer;

}
