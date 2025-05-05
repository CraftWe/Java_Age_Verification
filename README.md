# Age Verification Program

This Java program, `AgeVerification.java`, verifies if a user is 18 years or older.

## Features

* The program prompts the user to enter their age.
* It checks if the age is 18 or greater.
* If the age is less than 18, it throws an `InvalidAgeException`.
* If the age is 18 or greater, it prints "You are eligible."
* It handles the `InvalidAgeException` and displays the error message.

## How to Use

1.  Compile the Java code using a Java compiler (like javac):

    ```bash
    javac AgeVerification.java
    ```

2.  Run the compiled code:

    ```bash
    java AgeVerification
    ```

3.  The program will prompt you to enter your age. Enter your age as a number.

4.  The program will then display either "You are eligible." or an error message.

## Code Explanation

The `AgeVerification.java` file contains the following:

* `main(String[] args)`: The entry point of the program. It gets user input, calls the `checkAge` method, and displays the result or error message. It also uses a `try-with-resources` block to ensure the `Scanner` is closed.
* `checkAge(int age)`: This method checks if the given age is less than 18. If it is, it throws an `InvalidAgeException` with the message "You must be 18 years old or older."
* `InvalidAgeException`: A custom exception class that extends `Exception`. It's used to represent the error condition when the user is underage.
