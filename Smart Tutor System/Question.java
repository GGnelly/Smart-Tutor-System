public abstract class Question {
    protected String prompt;
    protected String answer;
    protected String category;

    public Question(String prompt, String answer, String category) {
        this.prompt = prompt;
        this.answer = answer;
        this.category = category;
    }

    public abstract boolean checkAnswer(String response);

    public String getPrompt() {
        return prompt;
    }

    public String getCategory() {
        return category;
    }
}
