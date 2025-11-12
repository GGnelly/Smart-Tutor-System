import java.util.*;

public class ProgressTracker {
    private Map<String, Integer> scores;
    private Map<String, Integer> categoryScores;
    private List<String> weakTopics;
    private List<String> recommendations;

    public ProgressTracker() {
        scores = new HashMap<>();
        categoryScores = new HashMap<>();
        weakTopics = new ArrayList<>();
        recommendations = new ArrayList<>();
    }

    public void updateProgress(String module, int score) {
        scores.put(module, score);
        if (score < 70) {
            weakTopics.add(module);
            recommendations.add("Review " + module + " for improvement.");
        }
    }

    public void updateCategory(String category, int score) {
        categoryScores.put(category, score);
    }

    public List<String> recommendNextLesson() {
        if (recommendations.isEmpty()) {
            recommendations.add("You are doing great! Continue to the next module.");
        }
        return recommendations;
    }

    public String getPerformanceReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- Performance Report ---\n");
        for (String key : scores.keySet()) {
            sb.append(key + ": " + scores.get(key) + "%\n");
        }
        return sb.toString();
    }
}
