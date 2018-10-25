package quiz.model;

import java.util.ArrayList;

/**
 *
 * @author Cal Payne
 */
public class QuizQuestions {

    private final ArrayList<Question> questions;
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
        count++;
        questions.add(question);
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
    public ArrayList<Question> getQuestions() {
        return questions;
    }

}
