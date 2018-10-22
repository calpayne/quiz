package quiz.model;

import java.util.ArrayList;
import quiz.view.MultipleChoiceQuestionPanel;
import quiz.view.QuestionPanel;
import quiz.view.SingleAnswerQuestionPanel;

/**
 *
 * @author Cal Payne
 */
public class Quiz {

    private final ArrayList<QuestionPanel> questions;
    private static Quiz instance;

    private Quiz() {
        questions = new ArrayList();
    }

    public static Quiz getInstance() {
        if (instance == null) {
            instance = new Quiz();
        }

        return instance;
    }

    public void addQuestion(Question question) {
        if (question instanceof MultipleChoiceQuestion) {
            questions.add(new MultipleChoiceQuestionPanel((MultipleChoiceQuestion) question));
        } else if (question instanceof SingleAnswerQuestion) {
            questions.add(new SingleAnswerQuestionPanel((SingleAnswerQuestion) question));
        }
    }

    public ArrayList<QuestionPanel> getQuestions() {
        return questions;
    }

}
