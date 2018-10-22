package quiz;

import java.awt.GridLayout;
import javax.swing.JFrame;
import quiz.model.MultipleChoiceQuestion;
import quiz.view.QuestionPanel;
import quiz.view.QuizPanel;

/**
 *
 * @author Cal PayneCould not resolve host: github.com

 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame app = new JFrame("Quiz");

        String[] choices = {"2001", "2002", "1999", "1995"};

        app.setLayout(new GridLayout(2, 1));

        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("When was Java made?", choices, 4);

        app.add(new QuizPanel());
        app.pack();
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
