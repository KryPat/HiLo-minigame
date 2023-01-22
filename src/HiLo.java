import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        // Klasa Scanner pozwala na otrzymywanie od użytkownia danych z klawiatury
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        do {

            // Tworzenie liczby losowej do odgadnięcia przez użytkownika
            int theNumber = (int) (Math.random() * 100 + 1);
            // System.out.println(theNumber);
            int guess = 0;
            while (guess != theNumber) {
                // Petla while
                // Prosi urzytkownika o wpsianie liczby, wyświetla okienko
                System.out.println("Guess a number between 1 and 100:");
                guess = scan.nextInt();
                System.out.println("You entered: " + guess + ".");
                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again.");
                else
                    System.out.println(guess + " is correct. You Win!");

            } // Zakończenie petli while do zgadywania
                System.out.println("would you like to play again? (y/n)");
                playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
    }
}
