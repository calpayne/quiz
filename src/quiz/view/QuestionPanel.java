package quiz.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import quiz.model.MultipleChoiceQuestion;

/**
 *
 * @author Cal Payne
 */
public class QuestionPanel extends JPanel {

    public QuestionPanel(MultipleChoiceQuestion q) {
        JLabel question = new JLabel(q.getQuestion());

        JComboBox choices = new JComboBox(q.getChoices());

        JButton submit = new JButton("Answer");
        submit.addActionListener((ActionEvent ae) -> {
            System.out.println(q.checkAnswer(choices.getSelectedIndex() + 1));
            choices.setEnabled(false);
        });

        this.add(question);
        this.add(choices);
        this.add(submit);

        this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 50));

        this.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.BLACK));
    }

}
