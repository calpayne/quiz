package quiz.model;

/**
 *
 * @author Cal Payne
 */
public class MultipleChoiceQuestion extends Question {

    private final String[] choices;
    private final int answer;
    private int theirAnswer;

    /**
     * Create a multiple choice question
     * 
     * @param question the question
     * @param choices the choices of answers
     * @param answer the index of choices for the correct answer
     */
    public MultipleChoiceQuestion(String question, String[] choices, int answer) {
        super(question);
        this.choices = choices;
        this.answer = answer;
    }

    /**
     * @return the array of choices
     */
    public String[] getChoices() {
        return choices;
    }

    /**
     * @param answer the answer to submit
     */
    public void submitAnswer(int answer) {
        this.theirAnswer = answer;
    }

    /**
     * @return if the submitted answer was correct
     */
    @Override
    public boolean checkAnswer() {
        return answer == theirAnswer;
    }

}
