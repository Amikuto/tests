import dao.AnswerDao;
import models.Answer;
import services.AnswerService;
import services.QuestionService;

public class Main {
    public static void main(String[] args) {
        AnswerService answerService = new AnswerService();
        QuestionService questionService = new QuestionService();

//        System.out.println(answerService.findAnswer(7));
//        System.out.println(questionService.findQuestion(2));
//        System.out.println(questionService.showAnswerList(1));
    }
}
