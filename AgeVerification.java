import java.util.Scanner;

public class AgeVerification {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();

			try {
			    checkAge(age);
			    System.out.println("You are eligible.");
			} catch (InvalidAgeException e) {
			    System.out.println("Error: " + e.getMessage());
			}
		}
    }

    private static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be 18 years old or older.");
        }
    }
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}