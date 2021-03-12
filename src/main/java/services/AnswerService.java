package services;

import dao.AnswerDao;
import models.Answer;

public class AnswerService {

    private AnswerDao answerDao = new AnswerDao();

    public Answer findAnswer(int id){
        return answerDao.findById(id);
    }
}
