package io.nurudeenlawal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nurudeenlawal on 4/28/16.
 */
public class Player {
    //A method designed to get a guess from the user
   public int guessANumber() {
       System.out.println("Give me a number between 1 and 20");
       Scanner sc = new Scanner(System.in);
        int input =0;
       /**
        * This method takes user input and stores it in variable guess
        */
       try {
           input = sc.nextInt();
       }catch (InputMismatchException e){
           System.out.println("We can't have that");
       }
       return input;
   }
}
