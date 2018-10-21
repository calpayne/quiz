package quiz.view;

import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import quiz.model.MultipleChoiceQuestion;

/**
 *
 * @author Cal Payne
 */
public class QuizPanel extends JPanel {
    
    private final JPanel questionsContainer;
    private int count;
    private int maxCount;
    
    public QuizPanel() {
        CardLayout layout = new CardLayout();
        count = 0;
        maxCount = 2;
        layout.setHgap(10);
        layout.setVgap(10);
        questionsContainer = new JPanel();
        questionsContainer.setLayout(layout);
        
        JProgressBar progress = new JProgressBar(0, maxCount);
        progress.setValue(count);
        
        String[] choices = {"2001", "2002", "1999", "1995"};
        questionsContainer.add(new QuestionPanel(new MultipleChoiceQuestion("When was Java made?", choices, 4)));
        questionsContainer.add(new QuestionPanel(new MultipleChoiceQuestion("When was HTML made?", choices, 1)));
        
        JButton previous = new JButton("Previous");
        previous.addActionListener((ActionEvent ae) -> {
            layout.previous(questionsContainer);
            count--;
            progress.setValue(count);
        });
        
        JButton next = new JButton("Next");
        next.addActionListener((ActionEvent ae) -> {
            layout.next(questionsContainer);
            count++;
            progress.setValue(count);
        });
        
        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(10, 10, 10, 10);
        this.add(questionsContainer, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.WEST;
        this.add(previous, c);
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        this.add(progress, c);
        c.gridx = 2;
        c.gridy = 1;
        c.anchor = GridBagConstraints.EAST;
        this.add(next, c);
    }
    
}
