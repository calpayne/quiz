package quiz.model;

import java.util.ArrayList;

/**
 *
 * @author Cal Payne
 */
public class Quiz {

    private final ArrayList<Question> questions;
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
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

}
