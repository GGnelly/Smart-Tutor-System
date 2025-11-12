import java.util.*;

public class GeneralQuiz extends Quiz {

    public void generateQuiz(List<Subject> subjects) {
        Random rand = new Random();
        for (Subject s : subjects) {
            List<Module> mods = s.getModules();
            for (Module m : mods) {
                Quiz q = m.getQuiz();
                if (q != null && q.questions.size() > 0) {
                    // pick one random question per module
                    Question randomQ = q.questions.get(rand.nextInt(q.questions.size()));
                    addQuestion(randomQ);
                }
            }
        }
    }

    public int takeQuiz() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        int correct = 0;

        for (Question q : questions) {
            if (q instanceof MultipleChoiceQuestion) {
                MultipleChoiceQuestion mcq = (MultipleChoiceQuestion) q;
                mcq.displayQuestion();
                System.out.print("Your answer: ");
                String ans = "";
                try {
                    ans = sc.nextLine().trim();
                } catch (Exception e) {
                    System.out.println("Input error, please try again.");
                    continue;
                }

                if (mcq.checkAnswer(ans)) {
                    System.out.println("Correct!\n");
                    correct++;
                } else {
                    System.out.println("Wrong!\n");
                }
            }
        }

        int score = calculateScore(correct, questions.size());
        System.out.println("Your General Quiz score: " + score + "%");
        return score;
    }
}
