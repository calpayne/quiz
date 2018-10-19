package quiz.model;

/**
 *
 * @author Cal Payne
 */
public class MultipleChoiceQuestion extends Question {
    
    private final String[] choices;
    private final int answer;

    public MultipleChoiceQuestion(String question, String[] choices, int answer) {
        super(question);
        this.choices = choices;
        this.answer = answer;
    }
    
    public String[] getChoices() {
        return choices;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return false;
    }

    @Override
    public boolean checkAnswer(int answer) {
        return this.answer == answer;
    }
    
}
