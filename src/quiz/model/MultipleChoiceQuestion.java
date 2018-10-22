package quiz.model;

/**
 *
 * @author Cal Payne
 */
public class MultipleChoiceQuestion extends Question {
    
    private final String[] choices;
    private final int answer;
    private int theirAnswer;

    public MultipleChoiceQuestion(String question, String[] choices, int answer) {
        super(question);
        this.choices = choices;
        this.answer = answer;
    }
    
    public String[] getChoices() {
        return choices;
    }
    
    public void submitAnswer(int answer) {
        this.theirAnswer = answer;
    }

    @Override
    public boolean checkAnswer() {
        return answer == theirAnswer;
    }
    
}
