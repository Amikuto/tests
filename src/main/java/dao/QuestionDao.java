package dao;

import models.Answer;
import models.Question;
import utils.HibernateSessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class QuestionDao {

    public QuestionDao(){}

    private List<Question> questions = new ArrayList<>();

    public Question findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Question.class, id);
    }

    public Answer findAnswerById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Answer.class, id);
    }
}
