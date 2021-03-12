package dao;

import models.Answer;
import utils.HibernateSessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class AnswerDao {
    public AnswerDao(){}

    private List<Answer> answers = new ArrayList<>();

    public Answer findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Answer.class, id);
    }

}
