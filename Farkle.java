import java.util.*;
public class Farkle {
    public static void main(String[] args) { 
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

        if (score1 > score2) {
            System.out.println(user1 + " You are player one" + user2 + " You are player 2");
            player1 = user1;
            player2 = user2;
        }
        if (score2 > score1) {
            System.out.println(user2 + " You are player one" + user1 + " You are player 2");
            player1 = user2;
            player2 = user1;
        }
        for (score1 = 0, score2 = 0; score1 < 10000 && score2 < 10000;) {
            String stopString = "";
            boolean hotDice = false;
            boolean farkel = false;
            boolean threeKind = false;
            int d1 = 0;
            int d2 = 0;
            int d3 = 0;
            int d4 = 0;
            int d5 = 0;
            int d6 = 0;
            while (!stopString.equals("stop") && farkel == false) {
                d1 = rand.nextInt();
                System.out.println("Dice 1 is: " + d1);
                d2 = rand.nextInt();
                System.out.println("Dice 2 is: " + d2);
                d3 = rand.nextInt();
                System.out.println("Dice 3 is: " + d3);
                d4 = rand.nextInt();
                System.out.println("Dice 4 is: " + d4);
                d5 = rand.nextInt();
                System.out.println("Dice 5 is: " + d5);
                d6 = rand.nextInt();
                System.out.println("Dice 6 is: " + d6);

                if () {

                }
                int store = 1;
                while (store == 1) {

                }
            }
        }
    }
}