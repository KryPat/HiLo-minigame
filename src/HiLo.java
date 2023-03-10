import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        // Klasa Scanner pozwala na otrzymywanie od użytkownia danych z klawiatury
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        do {

            // Tworzenie liczby losowej do odgadnięcia przez użytkownika
            int theNumber = (int) ((Math.random() * 200 + 1) - 100);
            System.out.println(theNumber);
            int guess = 0;
            int numberOfTries = 1;
            while (guess != theNumber) {
                // Petla while
                // Prosi urzytkownika o wpsianie liczby, wyświetla okienko
                System.out.println("Guess a number between -100 and 100:");
                guess = scan.nextInt();
                System.out.println("You entered: " + guess + ".");
                if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again.");
                    numberOfTries += 1;
                }
                else if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again.");
                    numberOfTries += 1;
                }
                else {
                    System.out.println(guess + " is correct. You Win!");
                    System.out.println("Number of tries is: " + numberOfTries);
                }

            } // Zakończenie petli while do zgadywania
                System.out.println("would you like to play again? (y/n)");
                playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye.");
        scan.close();
    }
}
