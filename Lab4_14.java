package Lab4_14;

import java.util.Scanner;

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Player(Player other) {
        this.name = other.name;
        this.score = other.score;
    }

    public void setScore(int score) { this.score = score; }
    public String getName() { return name; }
    public int getScore() { return score; }
}

class Team {
    private String teamName;
    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public Team(Team other) {
        this.teamName = other.teamName;
        this.players = new Player[other.players.length];
        for (int i = 0; i < other.players.length; i++) {
            this.players[i] = new Player(other.players[i]);
        }
    }

    public void updatePlayerScore(int index, int newScore) {
        if (index >= 0 && index < players.length) {
            players[index].setScore(newScore);
        }
    }

    public void displayTeam() {
        System.out.print("Team: " + teamName + " [");
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i].getName() + ": " + players[i].getScore());
            if (i < players.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class Lab4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String tName = sc.next();
            
            int numPlayers = sc.nextInt();
            Player[] playerArray = new Player[numPlayers];
            for (int i = 0; i < numPlayers; i++) {
                String pName = sc.next();
                int pScore = sc.nextInt();
                playerArray[i] = new Player(pName, pScore);
            }

            Team team1 = new Team(tName, playerArray);
            Team team2 = new Team(team1); 
            if (sc.hasNextInt()) {
                int playerIndex = sc.nextInt();
                int newScore = sc.nextInt();
                team1.updatePlayerScore(playerIndex, newScore);
            }

            team1.displayTeam();
            team2.displayTeam();

        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}