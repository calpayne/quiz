package quiz.view;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import quiz.model.SingleAnswerQuestion;

/**
 *
 * @author Cal Payne
 */
public class SingleAnswerQuestionPanel extends QuestionPanel {

    /**
     * Create the GUI for a Single Answer Question
     *
     * @param q the question to display
     */
    public SingleAnswerQuestionPanel(SingleAnswerQuestion q) {
        super(q);

        JTextField answer = new JTextField();

        submit.addActionListener((ActionEvent ae) -> {
            q.submitAnswer(answer.getText());
            System.out.println(q.checkAnswer());
            answer.setEditable(false);
            submit.setEnabled(false);
        });

        this.add(answer);
        this.add(submit);
    }

}
