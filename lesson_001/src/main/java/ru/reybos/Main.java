package ru.reybos;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.reybos.domain.Question;
import ru.reybos.service.QuestionService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        QuestionService service = context.getBean(QuestionService.class);
        List<Question> questions = service.findAll();
        questions.forEach(System.out::println);
    }

}
