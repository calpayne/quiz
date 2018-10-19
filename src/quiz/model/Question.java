package quiz.model;

/**
 *
 * @author Cal Payne
 */
public abstract class Question {
    
    private final String question;
    
    public Question(String question) {
        this.question = question;
    }
    
    public abstract boolean checkAnswer(String answer);
    
    public abstract boolean checkAnswer(int answer);
    
    public String getQuestion() {
        return question;
    }
    
}
