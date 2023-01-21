import java.util.*;

class Game {
	public int number;
	int inputNumber;
	public int noOfGuesses = 0;

	public int getNoOfGuesses() {
		return noOfGuesses;
	}

	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}

	Game() {
		Random r = new Random();
		this.number = r.nextInt(100);
	}

	void takeUserInput() {
		System.out.println("\nGuess the Number: ");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();

	}

	boolean isCorrectNumber() {
		noOfGuesses++;
		if (inputNumber == number) {
			return true;
		}
		else if (inputNumber < number) {
			System.out.println("You are to low...");
		}
		else if (inputNumber < number) {
			System.out.println("You are to low-10...");
		}
		else if (inputNumber > number) {
			System.out.println("You are to high...");
		} 
		else if (inputNumber > number) {
			System.out.println("You are to high+10...");
		}
		return false;
	}

}

public class Guess_The_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();
		boolean b = false;
		while (!b) {
			g.takeUserInput();
			b = g.isCorrectNumber();
		}

		System.out.println("Correct Guess");
		System.out.println("\nYou took " + g.noOfGuesses + " Attempt's");

	}

}
