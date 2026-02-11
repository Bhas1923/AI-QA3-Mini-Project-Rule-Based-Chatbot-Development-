import java.util.Scanner;

public class LibraryChatbot {

    public static String getResponse(String userInput) {
        userInput = userInput.toLowerCase();

        if (userInput.contains("hours") || userInput.contains("timing")) {
            return "The library is open from 9 AM to 6 PM, Monday to Friday.";
        }

        else if (userInput.contains("membership") || userInput.contains("join")) {
            return "You can get a library membership by filling out the registration form at the library desk.";
        }

        else if (userInput.contains("borrow") || userInput.contains("issue")) {
            return "You can borrow up to 3 books for a period of 14 days.";
        }

        else if (userInput.contains("return")) {
            return "Books should be returned on or before the due date to avoid fines.";
        }

        else if (userInput.contains("fine") || userInput.contains("penalty")) {
            return "The fine is Rs. 2 per day for late returns.";
        }

        else if (userInput.contains("book") || userInput.contains("available")) {
            return "You can check available books using the library catalog system.";
        }

        else if (userInput.contains("help")) {
            return "You can ask about library hours, membership, borrowing, fines, or book availability.";
        }

        else if (userInput.contains("exit") || userInput.contains("bye")) {
            return "Thank you for using the Library Chatbot. Goodbye!";
        }

        else {
            return "Sorry, I don't understand your question. Please ask something related to the library.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Library Chatbot: Hello! Ask me about the library.");
        System.out.println("Type 'exit' to quit.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = getResponse(userInput);
            System.out.println("Chatbot: " + response);

            if (userInput.toLowerCase().contains("exit") || 
                userInput.toLowerCase().contains("bye")) {
                break;
            }
        }

        scanner.close();
    }
}
