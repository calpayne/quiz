package quiz.model;

import quiz.view.MultipleChoiceQuestionPanel;
import quiz.view.QuestionPanel;
import quiz.view.SingleAnswerQuestionPanel;

/**
 *
 * @author Cal Payne
 */
public class QuestionFactory {
    
    /**
     * @param question the question to return as a panel
     * 
     * @return the question as the correct panel
     */
    public static QuestionPanel getQuestionPanel(Question question) {
        QuestionPanel qp = null;
        
        if (question instanceof MultipleChoiceQuestion) {
            qp = new MultipleChoiceQuestionPanel((MultipleChoiceQuestion) question);
        } else if (question instanceof SingleAnswerQuestion) {
            qp = new SingleAnswerQuestionPanel((SingleAnswerQuestion) question);
        }
        
        return qp;
    }
    
}
