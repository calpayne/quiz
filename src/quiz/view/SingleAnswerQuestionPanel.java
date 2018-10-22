package quiz.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import quiz.model.SingleAnswerQuestion;

/**
 *
 * @author Cal Payne
 */
public class SingleAnswerQuestionPanel extends JPanel implements QuestionPanel {

    public SingleAnswerQuestionPanel(SingleAnswerQuestion q) {
        GridLayout layout = new GridLayout(3, 1);
        layout.setVgap(15);

        JLabel question = new JLabel(q.getQuestion(), SwingConstants.CENTER);

        JTextField answer = new JTextField();

        JButton submit = new JButton("Confirm Answer");
        submit.addActionListener((ActionEvent ae) -> {
            q.submitAnswer(answer.getText());
            System.out.println(q.checkAnswer());
            answer.setEditable(false);
            submit.setEnabled(false);
        });

        this.add(question);
        this.add(answer);
        this.add(submit);
        this.setLayout(layout);
    }

}