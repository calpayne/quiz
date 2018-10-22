package quiz;

import javax.swing.JFrame;
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
        app.add(new QuizPanel());
        app.pack();
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
