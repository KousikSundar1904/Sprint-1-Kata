package entity;

import enumConstant.ScoreConstant;
import lombok.Data;

@Data
public class Match {
    private Player player1;
    private Player player2;
    private boolean lastPoint = false;
    private Player winner;
    private boolean gameOver;


    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void addScore(Player player) {
        player.setScore(player.getScore() + 1);
        int score1 = this.player1.getScore();
        int score2 = this.player2.getScore();
        if (score1 >= 3 || score2 >= 3) {
            if (score1 == score2) {
                System.out.println("DEUSE Rule is Activated");
            } else if (score1 > score2 && score1 - score2 >= 2) {
                this.winner = this.player1;
            } else if (score2 > score1 && score2 - score1 >= 2) {
                this.winner = this.player2;
            } else {
                System.out.println(player.getPlayerName() + " has the advantage");
            }
            extracted(player);
        } else {
            extracted(player);
        }
    }

    private void extracted(Player player) {
        if (this.player1.getPlayerName().equals(player.getPlayerName())) {
            if(this.player1.getScore() <=3){
                this.player1.getScoreList().add(ScoreConstant.valueOf(player.getScore()));
                this.player2.getScoreList().add(ScoreConstant.valueOf(this.player2.getScore()));
            }

        } else {
            if(this.player2.getScore()<=3) {
                this.player2.getScoreList().add(ScoreConstant.valueOf(player.getScore()));
                this.player1.getScoreList().add(ScoreConstant.valueOf(this.player1.getScore()));
            }
        }
    }


    public void printPoint() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.player1.getPlayerName());
        builder.append("\t");
        this.player1.getScoreList().forEach(data -> {
            builder.append(data).append("\t");
        });
        builder.append("\n");

        builder.append(this.player2.getPlayerName());
        builder.append("\t");
        this.player2.getScoreList().forEach(data -> {
            builder.append(data).append("\t");
        });
        System.out.println(builder);
    }
}
