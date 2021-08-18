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
        int score1 = this.player1.getScore();
        int score2 = this.player2.getScore();
        if ((score1 == 3 && score2 == 3)) {
            this.winner = player;
        }else if (score1 > 3){
            this.winner = this.player1;
        }else if(score2 > 3){
            this.winner = this.player2;
        } else {
            player.setScore(player.getScore() + 1);
            if (this.player1.getPlayerName().equals(player.getPlayerName())) {
                this.player1.getScoreList().add(ScoreConstant.valueOf(player.getScore()));
                this.player2.getScoreList().add(ScoreConstant.valueOf(this.player2.getScore()));
            } else {
                this.player2.getScoreList().add(ScoreConstant.valueOf(player.getScore()));
                this.player1.getScoreList().add(ScoreConstant.valueOf(this.player1.getScore()));
            }

            if(this.player1.getScore() == 3 && this.player2.getScore() == 3){
                System.out.println("DEUCE Rule is activated");
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
