package quiz.model;

/**
 *
 * @author Cal Payne
 */
public class SingleAnswerQuestion extends Question {
    
    private final String answer;
    private String theirAnswer;
    
    public SingleAnswerQuestion(String question, String answer) {
        super(question);
        this.answer = answer;
    }
    
    public void submitAnswer(String answer) {
        this.theirAnswer = answer;
    }
    
    @Override
    public boolean checkAnswer() {
        return answer.equalsIgnoreCase(theirAnswer);
    }
    
}
