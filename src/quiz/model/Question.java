package quiz.model;

/**
 *
 * @author Cal Payne
 */
public abstract class Question {

    private final String question;

    /**
     * @param question the question
     */
    public Question(String question) {
        this.question = question;
    }
    
    public abstract boolean checkAnswer();

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

}
