import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5]; 
    
    String selection[] = new String[5];

    public QuestionService(){
        
        questions[0] = new Question(1, "What is the capital of India?", "New Delhi", "Mumbai", "Chennai", "Kolkata", "New Delhi");
        questions[1] = new Question(2, "What is the capital of USA?", "Washington DC", "New York", "Los Angeles", "Chicago", "Washington DC");
        questions[2] = new Question(3, "What is the capital of Australia?", "Sydney", "Melbourne", "Brisbane", "Canberra", "Sydney");
        questions[3] = new Question(4, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[4] = new Question(5, "What is the capital of Germany?", "Berlin", "Paris", "London", "Madrid", "Berlin");
    }
    

    public void playQuiz() {

        int i = 0;
        for(Question q : questions) {
            System.out.println( q.getId() + ". " + q.getQuestion());
            System.out.println("Options: " + q.getOption1() + ", " + q.getOption2() + ", " + q.getOption3() + ", " + q.getOption4());

            System.out.println("Enter your answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        System.out.println("Your answers are: ");
        for(String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for(int i = 0; i < selection.length; i++) {
            
            Question que = questions[i];
            String actualAnswer= que.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
    
}
