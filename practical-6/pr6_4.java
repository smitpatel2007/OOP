// 4.	Write a program to throw your own exception by extending the Exception class.
// Step 1: Create your own Exception class
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Main class
public class pr6_4 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote!");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program completed.");
    }
}


