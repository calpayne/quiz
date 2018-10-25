package quiz.model;

/**
 *
 * @author Cal Payne
 */
public class SingleAnswerQuestion extends Question {

    private final String answer;
    private String theirAnswer;

    /**
     * Create a single answer question
     * 
     * @param question the question
     * @param answer the answer
     */
    public SingleAnswerQuestion(String question, String answer) {
        super(question);
        this.answer = answer;
    }

    /**
     * @param answer the answer to submit
     */
    public void submitAnswer(String answer) {
        this.theirAnswer = answer;
    }

    /**
     * @return if the submitted answer was correct
     */
    @Override
    public boolean checkAnswer() {
        return answer.equalsIgnoreCase(theirAnswer);
    }

}
