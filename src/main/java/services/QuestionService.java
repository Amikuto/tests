package services;

import dao.QuestionDao;
import models.Answer;
import models.Question;

public class QuestionService {
    private QuestionDao questionDao = new QuestionDao();

    public Question findQuestion(int id){
        return questionDao.findById(id);
    }

    public Answer showAnswerList(int id){
        return questionDao.findAnswerById(id);
    }
}
