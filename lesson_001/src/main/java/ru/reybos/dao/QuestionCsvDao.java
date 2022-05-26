package ru.reybos.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import ru.reybos.domain.Question;

public class QuestionCsvDao implements QuestionDao {

    private final String sourceFile;
    private List<Question> questions;

    public QuestionCsvDao(String sourceFile) {
        this.sourceFile = sourceFile;
        questions = readQuestionsFromFile();
    }

    private List<Question> readQuestionsFromFile() {
        try (
                MappingIterator<Question> questionIter = new CsvMapper()
                        .readerWithTypedSchemaFor(Question.class)
                        .readValues(getClass().getResource(sourceFile))
        ) {
            return questionIter.readAll();
        } catch (IOException e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }

    @Override
    public List<Question> findAll() {
        return questions;
    }

}
