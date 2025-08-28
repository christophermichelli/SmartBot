package smartbots;


import java.util.ArrayList;
import java.util.List;

public class KnowledgeBase {
    private List<FAQ> faqs;

    public KnowledgeBase() {
        faqs = new ArrayList<>();

        // ===========================
        // Basic Java
        // ===========================
        faqs.add(new FAQ("What is Java?", "Java is a high-level, class-based, object-oriented programming language."));
        faqs.add(new FAQ("What is the JVM?", "JVM stands for Java Virtual Machine, which runs Java bytecode."));
        faqs.add(new FAQ("What is JDK?", "JDK is the Java Development Kit used to develop Java applications."));
        faqs.add(new FAQ("What is JRE?", "JRE is the Java Runtime Environment used to run Java applications."));
        faqs.add(new FAQ("What is a variable?", "A variable stores data values in a program."));
        faqs.add(new FAQ("How do I declare a variable?", "Use a type followed by a variable name, e.g., int x = 5;"));
        faqs.add(new FAQ("What is a constant?", "A constant is a variable whose value cannot change, declared with 'final'."));

        // ===========================
        // Data types
        // ===========================
        faqs.add(new FAQ("What are primitive types?", "Primitive types are basic data types like int, double, boolean, and char."));
        faqs.add(new FAQ("What is a String?", "A String is a sequence of characters used to represent text."));
        faqs.add(new FAQ("What is an array?", "An array stores multiple values of the same type in a single variable."));

        // ===========================
        // Operators & expressions
        // ===========================
        faqs.add(new FAQ("What is an operator?", "An operator performs operations on variables and values, like +, -, *, /."));
        faqs.add(new FAQ("What is the difference between == and equals()?", "'==' compares references; equals() compares object values."));

        // ===========================
        // Loops & conditionals
        // ===========================
        faqs.add(new FAQ("What is a for loop?", "A for loop repeats code a specific number of times."));
        faqs.add(new FAQ("What is a while loop?", "A while loop repeats code while a condition is true."));
        faqs.add(new FAQ("What is a do-while loop?", "A do-while loop executes at least once, then repeats while a condition is true."));
        faqs.add(new FAQ("What is an if statement?", "An if statement executes code only if a condition is true."));
        faqs.add(new FAQ("What is an else statement?", "An else statement executes code if the if condition is false."));
        faqs.add(new FAQ("What is a switch statement?", "A switch statement selects a block of code to execute based on a value."));

        // ===========================
        // Methods
        // ===========================
        faqs.add(new FAQ("What is a method?", "A method is a block of code that performs a specific task."));
        faqs.add(new FAQ("How do I declare a method?", "Use: public void myMethod() { // code }"));
        faqs.add(new FAQ("What is method overloading?", "Method overloading allows multiple methods with the same name but different parameters."));
        faqs.add(new FAQ("What is method overriding?", "Method overriding allows a subclass to provide a specific implementation of a superclass method."));

        // ===========================
        // OOP
        // ===========================
        faqs.add(new FAQ("What is a class?", "A class is a blueprint for creating objects in Java."));
        faqs.add(new FAQ("What is an object?", "An object is an instance of a class."));
        faqs.add(new FAQ("What is inheritance?", "Inheritance allows a class to acquire properties of another class."));
        faqs.add(new FAQ("What is polymorphism?", "Polymorphism lets objects be treated as instances of their parent class."));
        faqs.add(new FAQ("What is encapsulation?", "Encapsulation hides internal data and exposes methods to interact with it."));
        faqs.add(new FAQ("What is abstraction?", "Abstraction hides complexity by exposing only essential details."));
        faqs.add(new FAQ("What is an interface?", "An interface defines methods that a class must implement."));
        faqs.add(new FAQ("What is an abstract class?", "An abstract class cannot be instantiated and may contain abstract methods."));

        // ===========================
        // Exceptions
        // ===========================
        faqs.add(new FAQ("What is an exception?", "An exception is an error that occurs during program execution."));
        faqs.add(new FAQ("What is a try-catch block?", "A try-catch block handles exceptions safely."));
        faqs.add(new FAQ("What is finally?", "Finally is a block that always executes after try-catch, used for cleanup."));

        // ===========================
        // Collections
        // ===========================
        faqs.add(new FAQ("What is an ArrayList?", "ArrayList is a resizable array that can store objects dynamically."));
        faqs.add(new FAQ("What is a HashMap?", "HashMap stores key-value pairs and allows fast retrieval by key."));
        faqs.add(new FAQ("What is a Set?", "A Set stores unique elements with no duplicates."));

        // ===========================
        // Misc
        // ===========================
        faqs.add(new FAQ("How do I compile Java?", "Use 'javac FileName.java' to compile your Java program."));
        faqs.add(new FAQ("How do I run Java?", "Use 'java ClassName' to run a compiled Java program."));
        faqs.add(new FAQ("What is the main method?", "The main method is the entry point of a Java program: public static void main(String[] args)."));
        faqs.add(new FAQ("What is static?", "Static members belong to the class, not instances."));
        faqs.add(new FAQ("What is final?", "Final variables cannot be reassigned; final methods cannot be overridden; final classes cannot be subclassed."));
        faqs.add(new FAQ("How do I exit the bot?", "Type 'exit' to close SmartBot at any time."));
        faqs.add(new FAQ("What can you do?", "I can answer common questions about Java programming."));

        // ===========================
        // Additional Java concepts
        // ===========================
        faqs.add(new FAQ("What is a boolean?", "A boolean represents true or false values."));
        faqs.add(new FAQ("What is a char?", "A char stores a single character, like 'A' or 'z'."));
        faqs.add(new FAQ("How do I concatenate strings?", "Use the + operator, e.g., 'Hello' + ' World' gives 'Hello World'."));
        faqs.add(new FAQ("What is a nested loop?", "A loop inside another loop is called a nested loop."));
        faqs.add(new FAQ("How do I convert a string to an integer?", "Use Integer.parseInt(string) to convert a string to an int."));
        faqs.add(new FAQ("What is a constructor?", "A constructor is a special method used to initialize objects of a class."));
        faqs.add(new FAQ("What is the difference between == and equals() for strings?", "'==' checks reference equality; equals() checks the actual content of the strings."));
    }

    public List<FAQ> getFaqs() {
        return faqs;
    }

    // Dynamic addition of FAQs
    public void addFaq(String question, String answer) {
        faqs.add(new FAQ(question, answer));
    }
}