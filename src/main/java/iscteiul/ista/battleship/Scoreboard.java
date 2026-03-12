package iscteui.ista.battleship;

public class Scoreboard {

    private int player1Wins;
    private int player2Wins;

    public void addPlayer1Win() {
        player1Wins++;
    }

    public void addPlayer2Win() {
        player2Wins++;
    }

    public void printScoreboard() {
        System.out.println("=== Scoreboard ===");
        System.out.println("Player 1 Wins: " + player1Wins);
        System.out.println("Player 2 Wins: " + player2Wins);
    }
}