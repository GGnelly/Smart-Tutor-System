import java.util.*;

public abstract class Quiz {
    protected List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public abstract int takeQuiz();

    public int calculateScore(int correct, int total) {
        return (int) (((double) correct / total) * 100);
    }
}
