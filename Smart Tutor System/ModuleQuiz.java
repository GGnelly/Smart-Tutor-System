import java.util.*;

public class ModuleQuiz extends Quiz {

    public int takeQuiz() {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Your score: " + score + "%");
        return score;
        
    }
    
}
