import java.util.Scanner;
import java.util.Random;
public class rockAndpaper {
    public static void main(String[] args){
    System.out.println("Enter 1 for Rock, enter 2 for Paper, enter 3 for Scissor");
    Scanner N = new Scanner(System.in);
    Random A = new Random();
    int userInput = N.nextInt();
    int computer= A.nextInt(3);
    if(userInput==computer){
        System.out.println("Draw");
    }
    else if(userInput==1 && computer==3 || userInput==2 && computer==1 || userInput==3 && computer==2){
        System.out.println("You Win");
    }
    else{
        System.out.println("Computer win");
        }
    System.out.println("Computer choice "+computer);
    System.out.println("My choice "+userInput);
    }
}
