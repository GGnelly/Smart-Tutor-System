public class Module {
    private String title;
    private String lessonContent;
    private ModuleQuiz quiz;

    public Module(String title, String lessonContent, ModuleQuiz quiz) {
        this.title = title;
        this.lessonContent = lessonContent;
        this.quiz = quiz;
    }

    public String getTitle() {
        return title;
    }

    public void displayLesson() {
        System.out.println("\n--- " + title + " ---");
        System.out.println(lessonContent + "\n");
    }

    public Quiz getQuiz() {
        return quiz;
    }
}
