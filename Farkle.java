import java.util.*;
public class Farkle
{
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String player1 = "";
        String player2 = "";
        System.out.println("Player 1 enter your name: ");
        String user1 = scan.next();
        int score1 = rand.nextInt(6) + 1;

        System.out.println("Player 2 enter your name: ");
        String user2 = scan.next();
        int score2 = rand.nextInt(6) + 1;

        if (score1 > score2)
        {
            System.out.println(user1 + " You are player one" + user2 + " You are player 2");
            player1 = user1;
            player2 = user2;
        }
        if (score2 > score1)
        {
            System.out.println(user2 + " You are player one" + user1 + " You are player 2");
            player1 = user2;
            player2 = user1;
        }
    }
}