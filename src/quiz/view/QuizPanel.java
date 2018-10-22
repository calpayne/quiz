package quiz.view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import quiz.model.MultipleChoiceQuestion;
import quiz.model.QuizQuestions;
import quiz.model.SingleAnswerQuestion;

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
        count = 1;
        maxCount = QuizQuestions.getInstance().getCount();
        System.out.println("MAXCOUNT: " + maxCount);
        layout.setHgap(10);
        layout.setVgap(10);
        questionsContainer = new JPanel();
        questionsContainer.setLayout(layout);

        JProgressBar progress = new JProgressBar(0, maxCount);
        progress.setPreferredSize(new Dimension(500, 24));
        progress.setValue(count);

        QuizQuestions.getInstance().getQuestions().forEach((qp) -> {
            questionsContainer.add(qp);
        });

        JButton previous = new JButton("Previous");
        previous.addActionListener((ActionEvent ae) -> {
            layout.previous(questionsContainer);
            if (count - 1 == 0) {
                count = maxCount;
            } else {
                count--;
            }
            progress.setValue(count);
        });

        JButton next = new JButton("Next");
        next.addActionListener((ActionEvent ae) -> {
            layout.next(questionsContainer);
            if (count + 1 == maxCount + 1) {
                count = 1;
            } else {
                count++;
            }
            progress.setValue(count);
        });

        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(100, 10, 10, 10);
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
