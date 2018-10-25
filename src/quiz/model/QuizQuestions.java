package quiz.model;

import java.util.ArrayList;
import quiz.view.MultipleChoiceQuestionPanel;
import quiz.view.QuestionPanel;
import quiz.view.SingleAnswerQuestionPanel;

/**
 *
 * @author Cal Payne
 */
public class QuizQuestions {

    private final ArrayList<QuestionPanel> questions;
    private int count;
    private static QuizQuestions instance;

    private QuizQuestions() {
        count = 0;
        questions = new ArrayList();
    }

    /**
     * @return the only QuizQuestions instance
     */
    public static QuizQuestions getInstance() {
        if (instance == null) {
            instance = new QuizQuestions();
        }

        return instance;
    }

    /**
     * Add a question to the quiz
     * 
     * @param question the question to add
     */
    public void addQuestion(Question question) {
        if (question instanceof MultipleChoiceQuestion) {
            count++;
            questions.add(new MultipleChoiceQuestionPanel((MultipleChoiceQuestion) question));
        } else if (question instanceof SingleAnswerQuestion) {
            count++;
            questions.add(new SingleAnswerQuestionPanel((SingleAnswerQuestion) question));
        }
    }

    /**
     * @return total number of questions in the quiz
     */
    public int getCount() {
        return count;
    }

    /**
     * @return an ArrayList of the questions in the quiz
     */
    public ArrayList<QuestionPanel> getQuestions() {
        return questions;
    }

}
