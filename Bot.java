package smartbots;

import java.util.Scanner;

public class Bot {
    private KnowledgeBase knowledgeBase;

    public Bot() {
        knowledgeBase = new KnowledgeBase();
    }

    // Starts the chatbot interaction
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SmartBot! Ask me anything about Java or type 'exit' to quit.");

        while (true) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("SmartBot: Goodbye!");
                break;
            }

            FAQ response = ResponseRanker.getBestMatch(input, knowledgeBase.getFaqs());

            if (response != null) {
                System.out.println("SmartBot: " + response.getAnswer());
            } else {
                System.out.println("SmartBot: Sorry, I don't know the answer to that yet.");

                // Ask the user if they want to teach SmartBot
                System.out.print("Would you like to teach me the answer? (yes/no): ");
                String teachResponse = scanner.nextLine().trim();

                if (teachResponse.equalsIgnoreCase("yes")) {
                    System.out.print("Please provide the answer: ");
                    String answer = scanner.nextLine().trim();

                    // Add the new question-answer pair to the knowledge base
                    knowledgeBase.addFaq(input, answer);
                    System.out.println("SmartBot: Thank you! I've learned a new answer.");
                }
            }
        }

        scanner.close();
    }
}
