package ru.reybos.dao;

import java.util.List;

import ru.reybos.domain.Question;

public interface QuestionDao {

    List<Question> findAll();

}
