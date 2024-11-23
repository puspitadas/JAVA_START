import java.util.Scanner;
import java.util.Random;
public class Game_RockPaperScissor {
    //Game with Human and Computer using Human Input and Random Input respectively
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for rock, 2 for paper, 3 for scissor: ");
        int human = sc.nextInt();
        switch (human){
            case 1 : System.out.println("You have chosen rock.");
                break;
            case 2 : System.out.println("You have chosen Paper.");
                break;
            case 3 : System.out.println("You have chosen Scissor.");
                break;
            default : System.out.println("Invalid move. Please make a valid move.");
                break;
        }
        int min = 1;
        int max = 3;
        System.out.println("Computer has chosen: ");
        int x = (int)(Math.random()*(max-min+1)+min);
        System.out.println(x);
        switch (x) {
            case 1 : System.out.println("Computer have chosen rock.");
                break;
            case 2 : System.out.println("Computer have chosen Paper.");
                break;
            case 3 : System.out.println("Computer have chosen Scissor.");
            break;
        }
        if (human == x){
            System.out.println("Match tie.");
        }
        else if((human == 1 && x == 2)||(human == 2 && x == 3)||(human == 3 && x == 1)){
            System.out.println("Computer won!");
        }
        else if((human == 1 && x == 3)||(human == 2 && x == 1)||(human == 3 && x == 2)) {
            System.out.println("Congratulations! You won the game!");
        }
        else if(human >= 4){
            System.out.println("Match cannot be played");
        }

    }
}
