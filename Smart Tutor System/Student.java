public class Student extends User {
    private ProgressTracker progressTracker;

    public Student(String username, String password) {
        super(username, password);
        progressTracker = new ProgressTracker();
    }

    public void takeQuiz(Quiz quiz) {
        System.out.println("Starting quiz...");
        int score = quiz.takeQuiz();
        progressTracker.updateProgress("Quiz", score);
    }

    public void viewRecommendations() {
        System.out.println("Recommendations: ");
        for (String rec : progressTracker.recommendNextLesson()) {
            System.out.println("- " + rec);
        }
    }

    public void reviewPastResults() {
        System.out.println(progressTracker.getPerformanceReport());
    }

    public void trackCategoryPerformance() {
        System.out.println("Tracking performance by category...");
    }

    public void retryWeakModules() {
        System.out.println("Retrying weak modules...");
    }
}
