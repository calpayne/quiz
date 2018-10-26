package quiz.view;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import quiz.model.MultipleChoiceQuestion;

/**
 *
 * @author Cal Payne
 */
public class MultipleChoiceQuestionPanel extends QuestionPanel {

    /**
     * Create the GUI for a Multiple Choice Question
     *
     * @param q the question to display
     */
    public MultipleChoiceQuestionPanel(MultipleChoiceQuestion q) {
        super(q);

        JComboBox choices = new JComboBox(q.getChoices());

        submit.addActionListener((ActionEvent ae) -> {
            q.submitAnswer(choices.getSelectedIndex() + 1);
            System.out.println(q.checkAnswer());
            choices.setEnabled(false);
            submit.setEnabled(false);
        });

        this.add(choices);
        this.add(submit);
    }

}
