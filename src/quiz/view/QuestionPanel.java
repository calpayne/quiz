package quiz.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import quiz.model.Question;

/**
 *
 * @author Cal Payne
 */
public abstract class QuestionPanel extends JPanel {

    protected JButton submit;
    
    /**
     * The base of other Question Panels
     *
     * @param q the question to display
     */
    public QuestionPanel(Question q) {
        GridLayout layout = new GridLayout(3, 1);
        layout.setVgap(15);
        
        JLabel question = new JLabel(q.getQuestion(), SwingConstants.CENTER);
        submit = new JButton("Confirm Answer");
        
        this.setLayout(layout);
        this.add(question);
    }
    
}
