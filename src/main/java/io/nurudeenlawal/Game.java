package io.nurudeenlawal;

/**
 * Created by nurudeenlawal on 4/28/16.
 */

public class Game {
    //Declaring Variables
    public int secretNumber = 8;/* Number the player is going to try to guess*/
    public int lastGuess = 0; /*This will be a variable used to store the last guess for comparison*/
    public int numberOfTries = 0;/*This will be incremented to represent the number of tries*/
    public int guess;


    //This comunicates with the player class to get an player guess
    //This method compares the current guess to the last guess and if they aren't calls the next Equality test
    public boolean compareChoices() {
        if (guess != lastGuess) {
            numberOfTries++;
            return false;
        }

        return true;
    }

    // This tests the player's guess against the secret number
    public boolean isItEqual() {
        return (guess == secretNumber);
    }

    //This compares the Guess and the secret number to see if the guess is higher and gives a message
    public boolean isItHigher() {
        return (guess > secretNumber);
        }

    //This compares the Guess and the secret number to see if the guess is lower and gives a message
    public boolean isItLower() {
        return (guess < secretNumber);
    }

    public void checkGuess() {
        if (compareChoices()) {
            return;
        } else if (isItEqual()) {
            System.out.println("You are correct " + guess + " is the number it took you " + numberOfTries + " tries");
        } else if (isItHigher()) {
            System.out.println("Too High");
            lastGuess = guess;
        } else if (isItLower()) {
            System.out.println("Too low");
            lastGuess = guess;
        }

    }

    public void loopGame(Player player) {
        while (this.secretNumber != this.guess) {
            this.guess = player.guessANumber();
            this.checkGuess();
        }
    }
}


