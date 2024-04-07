import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Guess a number from 1-100: ");
    int guess = scan.nextInt();
    int random = (int) (Math.random() * 100);
    random += 1;
    Boolean win = false;
    int guesses = 1;
    while (!(win) && guesses!=8){
      if(guess > random){
        System.out.print("Too high, try again: ");
        guess = scan.nextInt();
        guesses++;
      }else if(guess < random){
        System.out.print("Too low, try again: ");
        guess = scan.nextInt();
        guesses++;
      }else{
        System.out.println("Correct!");
        win = true;
      }
    }
    if(guesses == 7 && !(win)){
      System.out.println("You have run out of guesses. The number was "+random+". Better luck next \ntime!");
    }
  }
}