import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
                Student student = new Student("Student", "password123");
                student.login();
                
                Subject english = new Subject("English");

                Module rhymingWords = new Module(
                        "Rhyming Words",
                        "Words rhyme when they have the same ending sounds. Example: cat - hat, sun - fun, play - day.\n" +
                                "Learning Goal: Identify pairs of rhyming words in simple sentences or poems.",
                        new ModuleQuiz());
                rhymingWords.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which pair of words rhyme?",
                        "1",
                        Arrays.asList("Cat - Hat", "Dog - Fish", "Sun - Cloud", "Book - Pen"),
                        "Rhyming"));
                rhymingWords.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What do rhyming words have in common?",
                        "3",
                        Arrays.asList("Same beginning", "Same meaning", "Same ending sound", "Same spelling"),
                        "Rhyming"));
                rhymingWords.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which pair does NOT rhyme?",
                        "2",
                        Arrays.asList("Ball - Tall", "Tree - Rock", "Day - Play", "Moon - Spoon"),
                        "Rhyming"));
                english.addModule(rhymingWords);

                Module sentences = new Module(
                        "Sentences and Non-Sentences",
                        "A sentence tells a complete thought. It begins with a capital letter and ends with a period, question mark, or exclamation point.\n"
                                +
                                "A non-sentence does not express a complete idea. Example: 'The dog' (non-sentence), 'The dog is barking.' (sentence).",
                        new ModuleQuiz());
                sentences.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which of the following is a complete sentence?",
                        "2",
                        Arrays.asList("The cat", "The cat is sleeping.", "In the garden", "The dog and"),
                        "Grammar"));
                sentences.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which one is NOT a sentence?",
                        "1",
                        Arrays.asList("Beautiful flower", "She likes apples.", "I am happy.", "They are playing."),
                        "Grammar"));
                sentences.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What does a sentence always start with?",
                        "3",
                        Arrays.asList("A smile", "A question", "A capital letter", "A comma"),
                        "Grammar"));
                english.addModule(sentences);

                Module community = new Module(
                        "Self, Family, School, and Community",
                        "We belong to different groups — our family, school, and community. Each one helps us learn and grow.\n"
                                +
                                "Learning Goal: Identify and describe the people and places that are part of our daily lives.",
                        new ModuleQuiz());
                community.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Who are the people in your family?",
                        "1",
                        Arrays.asList("Parents and siblings", "Teachers and classmates", "Friends and neighbors",
                                "Drivers and sellers"),
                        "Comprehension"));
                community.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Where do you learn and play with classmates?",
                        "3",
                        Arrays.asList("Market", "Home", "School", "Store"),
                        "Comprehension"));
                community.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Who keeps the community safe?",
                        "2",
                        Arrays.asList("Teacher", "Police officer", "Vendor", "Driver"),
                        "Comprehension"));
                english.addModule(community);

                Module storyDetails = new Module(
                        "Details in Short Stories or Poems",
                        "Every story or poem has details — characters, places, and events. Paying attention helps us understand what happens.\n"
                                +
                                "Learning Goal: Identify characters, settings, and key events in short stories or poems.",
                        new ModuleQuiz());
                storyDetails.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Who is the main character in a story?",
                        "2",
                        Arrays.asList("The writer", "The person the story is about", "The reader", "The teacher"),
                        "Comprehension"));
                storyDetails.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What is the setting of a story?",
                        "1",
                        Arrays.asList("Where and when it happens", "How it ends", "The title", "The rhyme"),
                        "Comprehension"));
                storyDetails.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which is an example of a story detail?",
                        "4",
                        Arrays.asList("Book cover", "Chapter number", "Page count", "The boy played in the park."),
                        "Comprehension"));
                english.addModule(storyDetails);

                Module polite = new Module(
                        "Polite Expressions",
                        "We use polite expressions to show respect and kindness. Examples include: please, thank you, sorry, excuse me.\n"
                                +
                                "Learning Goal: Use polite words and phrases in everyday situations.",
                        new ModuleQuiz());
                polite.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What should you say when you ask for something?",
                        "3",
                        Arrays.asList("Now!", "Give me", "Please", "Nothing"),
                        "Politeness"));
                polite.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What do you say when you receive help?",
                        "2",
                        Arrays.asList("Goodbye", "Thank you", "Okay", "Wait"),
                        "Politeness"));
                polite.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What do you say after bumping into someone by mistake?",
                        "1",
                        Arrays.asList("Sorry", "Hello", "No", "Hey"),
                        "Politeness"));
                english.addModule(polite);

                Subject math = new Subject("Mathematics");

                Module shapes = new Module(
                        "Measurement and Geometry – 2D Shapes",
                        "Shapes are everywhere! We can see circles, squares, triangles, and rectangles around us.\n" +
                                "Each shape has sides and corners. Example: A triangle has 3 sides and 3 corners; a square has 4 sides and 4 corners.\n"
                                +
                                "Learning Goal: Identify basic 2D shapes and their features.",
                        new ModuleQuiz());
                shapes.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which shape has 3 sides?",
                        "1",
                        Arrays.asList("Triangle", "Square", "Circle", "Rectangle"),
                        "Geometry"));
                shapes.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which shape has no corners?",
                        "3",
                        Arrays.asList("Rectangle", "Triangle", "Circle", "Square"),
                        "Geometry"));
                shapes.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which shape has 4 equal sides?",
                        "2",
                        Arrays.asList("Triangle", "Square", "Circle", "Oval"),
                        "Geometry"));
                shapes.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which shape looks like a door?",
                        "4",
                        Arrays.asList("Circle", "Triangle", "Oval", "Rectangle"),
                        "Geometry"));
                math.addModule(shapes);

                Module numbers = new Module(
                        "Number and Algebra – Whole Numbers and Addition",
                        "Numbers help us count, order, and add. Whole numbers start from 1, 2, 3, and so on.\n" +
                                "Ordinal numbers tell position (first, second, third...). Addition means putting numbers together.\n"
                                +
                                "Learning Goal: Identify, order, and add whole numbers up to 20.",
                        new ModuleQuiz());
                numbers.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What comes after 7?",
                        "3",
                        Arrays.asList("5", "6", "8", "10"),
                        "Counting"));
                numbers.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What number comes before 10?",
                        "1",
                        Arrays.asList("9", "8", "7", "6"),
                        "Counting"));
                numbers.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What is 8 + 5?",
                        "2",
                        Arrays.asList("12", "13", "14", "15"),
                        "Addition"));
                numbers.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What is the 3rd position in: Apple, Banana, Orange, Mango?",
                        "4",
                        Arrays.asList("Apple", "Banana", "Mango", "Orange"),
                        "Ordinal"));
                numbers.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which shows addition?",
                        "1",
                        Arrays.asList("2 + 3 = 5", "5 - 2 = 3", "6 ÷ 2 = 3", "4 × 2 = 8"),
                        "Addition"));
                math.addModule(numbers);

                Subject gmrc = new Subject("Good Manners and Right Conduct (GMRC)");

                Module self = new Module(
                        "Knowing Myself",
                        "We are all unique and special. We have our own names, birthdays, and likes.\n" +
                                "Knowing ourselves helps us appreciate who we are and how we can grow.\n" +
                                "Learning Goal: Identify personal information such as name, gender, and age.",
                        new ModuleQuiz());
                self.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which of the following tells who you are?",
                        "1",
                        Arrays.asList("My name is Anna.", "I like apples.", "I have a toy.", "I go to school."),
                        "Self-awareness"));
                self.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "If you were born in 2017 and it is 2025, how old are you?",
                        "3",
                        Arrays.asList("5", "6", "8", "10"),
                        "Self-awareness"));
                self.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What should you say when introducing yourself?",
                        "2",
                        Arrays.asList("Hi!", "Hello, my name is Ana.", "Goodbye!", "How are you?"),
                        "Manners"));
                gmrc.addModule(self);

                Module feelings = new Module(
                        "Understanding Feelings",
                        "Everyone feels happy, sad, or angry sometimes. Our feelings tell us what we need.\n" +
                                "It is important to express feelings kindly and respect others’ emotions.\n" +
                                "Learning Goal: Identify and respect different emotions.",
                        new ModuleQuiz());
                feelings.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What should you do if your friend is sad?",
                        "3",
                        Arrays.asList("Laugh at them", "Ignore them", "Comfort them", "Run away"),
                        "Empathy"));
                feelings.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "Which feeling do you have when you get a gift?",
                        "1",
                        Arrays.asList("Happy", "Angry", "Scared", "Sad"),
                        "Emotion"));
                feelings.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What should you do when you feel angry?",
                        "4",
                        Arrays.asList("Shout at others", "Break things", "Cry loudly", "Calm down and talk"),
                        "Self-control"));
                gmrc.addModule(feelings);

                Module friendship = new Module(
                        "Making Friends",
                        "Friends make our days brighter! We show kindness and respect to build friendships.\n" +
                                "Good friends listen, share, and play nicely together.\n" +
                                "Learning Goal: Understand how to make and keep friends.",
                        new ModuleQuiz());
                friendship.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What should you do when meeting a new classmate?",
                        "1",
                        Arrays.asList("Smile and say hello", "Ignore them", "Laugh at them", "Walk away"),
                        "Friendship"));
                friendship.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "How can you show kindness to a friend?",
                        "2",
                        Arrays.asList("Take their toys", "Share your crayons", "Push them", "Ignore them"),
                        "Kindness"));
                friendship.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What makes a good friend?",
                        "3",
                        Arrays.asList("Being mean", "Always winning", "Being kind and respectful", "Telling lies"),
                        "Respect"));
                gmrc.addModule(friendship);

                Module respect = new Module(
                        "Valuing Friendship",
                        "True friends respect, forgive, and support each other.\n" +
                                "We keep our promises and help friends in need.\n" +
                                "Learning Goal: Value friendship by showing honesty and care.",
                        new ModuleQuiz());
                respect.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What should you say if you hurt a friend’s feelings?",
                        "4",
                        Arrays.asList("Never mind", "It's your fault", "I don’t care", "I’m sorry"),
                        "Respect"));
                respect.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "What does it mean to be honest?",
                        "1",
                        Arrays.asList("Telling the truth", "Lying", "Hiding mistakes", "Pretending"),
                        "Values"));
                respect.getQuiz().addQuestion(new MultipleChoiceQuestion(
                        "How do we show care to friends?",
                        "2",
                        Arrays.asList("Ignore them", "Listen and help", "Tease them", "Get angry"),
                        "Empathy"));
                gmrc.addModule(respect);

                List<Subject> subjects = new ArrayList<Subject>();
            subjects.add(english);
            subjects.add(math);
            subjects.add(gmrc);

            Scanner sc = new Scanner(System.in);
            int choice = 0;

            do {
                try {
                    System.out.println("\n=== SMART TUTORING SYSTEM ===");
                    System.out.println("1. View Subjects");
                    System.out.println("2. Take General Assessment");
                    System.out.println("3. View Progress Report");
                    System.out.println("4. View Lesson Recommendations");
                    System.out.println("5. Exit");
                    System.out.print("Choose: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a number.");
                        sc.nextLine();
                        continue;
                    }

                    choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            showSubjects(student, subjects, sc);
                            break;
                        case 2:
                            GeneralQuiz gq = new GeneralQuiz();
                            gq.generateQuiz(subjects);
                            student.takeQuiz(gq);
                            break;
                        case 3:
                            student.reviewPastResults();
                            break;
                        case 4:
                            student.viewRecommendations();
                            break;
                        case 5:
                            System.out.println("Thank you for using STS!");
                            student.logout();
                            break;
                        default:
                            System.out.println("Invalid choice! Try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Input stream closed unexpectedly.");
                    break;
                } catch (Exception e) {
                    System.out.println("Something went wrong: " + e.getMessage());
                }
            } while (choice != 5);

            System.out.println("Program ended.");
        } catch (Exception e) {
            System.out.println("System error: " + e.getMessage());
        }
    }

    public static void showSubjects(Student student, List<Subject> subjects, Scanner sc) {
        try {
            System.out.println("\nSelect a subject:");
            for (int i = 0; i < subjects.size(); i++) {
                System.out.println((i + 1) + ". " + subjects.get(i).getName());
            }
            System.out.print("Choose: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                return;
            }

            
            int subChoice = sc.nextInt();
            sc.nextLine();

            if (subChoice < 1 || subChoice > subjects.size()) {
                System.out.println("Invalid subject choice!");
                return;
            }

            Subject selectedSubject = subjects.get(subChoice - 1);
            selectedSubject.displayModules();
            
            System.out.print("Choose: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                return;
            }

            int modChoice = sc.nextInt();
            sc.nextLine();

            if (modChoice < 1 || modChoice > selectedSubject.getModules().size()) {
                System.out.println("Invalid module choice!");
                return;
            }

            Module selectedModule = selectedSubject.getModules().get(modChoice - 1);
            selectedModule.displayLesson();

            System.out.print("Take quiz for this module? (yes/no): ");
            String takeQuiz = sc.nextLine().trim().toLowerCase();

            if (takeQuiz.equals("yes")) {
                selectedModule.getQuiz().takeQuiz();
            } else if (takeQuiz.equals("no")) {
                System.out.println("Returning to menu.");
            } else {
                System.out.println("Invalid input. Please type yes or no only.");
            }
         
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            sc.nextLine();
        } catch (NullPointerException e) {
            System.out.println("Quiz not found for this module.");
        } catch (NoSuchElementException e) {
            System.out.println("Input ended unexpectedly.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}