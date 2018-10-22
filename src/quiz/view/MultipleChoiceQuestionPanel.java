package quiz.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import quiz.model.MultipleChoiceQuestion;

/**
 *
 * @author Cal Payne
 */
public class MultipleChoiceQuestionPanel extends JPanel implements QuestionPanel {

    public MultipleChoiceQuestionPanel(MultipleChoiceQuestion q) {
        GridLayout layout = new GridLayout(3, 1);
        layout.setVgap(15);

        JLabel question = new JLabel(q.getQuestion(), SwingConstants.CENTER);

        JComboBox choices = new JComboBox(q.getChoices());

        JButton submit = new JButton("Confirm Answer");
        submit.addActionListener((ActionEvent ae) -> {
            q.submitAnswer(choices.getSelectedIndex() + 1);
            System.out.println(q.checkAnswer());
            choices.setEnabled(false);
            submit.setEnabled(false);
        });

        this.add(question);
        this.add(choices);
        this.add(submit);
        this.setLayout(layout);
    }

}
