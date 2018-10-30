package quiz;

import javax.swing.JFrame;
import quiz.model.MultipleChoiceQuestion;
import quiz.model.QuizQuestions;
import quiz.model.SingleAnswerQuestion;
import quiz.view.QuizPanel;

/**
 *
 * @author Cal Payne
 *
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuizQuestions qq = QuizQuestions.getInstance();
        String[] choices = {"2001", "2002", "1999", "1995"};
        qq.addQuestion(new MultipleChoiceQuestion("In which year was Java made blah blah?", choices, 4));
        qq.addQuestion(new SingleAnswerQuestion("What is the most used and unsecure password?", "Password"));
        qq.addQuestion(new MultipleChoiceQuestion("When was HTML made?", choices, 1));
        qq.addQuestion(new SingleAnswerQuestion("What does HTML stand for?", "Hyper Text Markup Language"));

        JFrame app = new JFrame("Quiz");
        app.add(new QuizPanel());
        app.pack();
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setVisible(true);
    }

}
