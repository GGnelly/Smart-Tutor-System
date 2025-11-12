import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> options;

    public MultipleChoiceQuestion(String prompt, String answer, List<String> options, String category) {
        super(prompt, answer, category);
        this.options = options;
    }

    @Override
    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(super.answer);
    }

    public List<String> getOptions() {
        return options;
    }

    public void displayQuestion() {
        System.out.println(prompt);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

}
