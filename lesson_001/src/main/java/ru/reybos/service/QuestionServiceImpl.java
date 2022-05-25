package ru.reybos.service;

import java.util.List;

import lombok.AllArgsConstructor;
import ru.reybos.dao.QuestionDao;
import ru.reybos.domain.Question;

@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private QuestionDao questionDao;

    public List<Question> findAll() {
        return questionDao.findAll();
    }

}
