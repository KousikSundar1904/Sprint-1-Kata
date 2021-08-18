package entity;


import org.junit.Test;

import java.util.Arrays;


public class MatchTest {



    @Test
    public void addScoreTest(){
        Player firstPlayer = new Player("Test");
        Player secondPlayer = new Player("Sample");
        Player p = new Player("Test");
        Match match = new Match(firstPlayer,secondPlayer);
        p.setScore(1);
        match.addScore(p);
    }

    @Test
    public void addScoreTest1(){
        Player firstPlayer = new Player("Test");
        firstPlayer.setScore(3);
        Player secondPlayer = new Player("Sample");
        secondPlayer.setScore(3);
        Player p = new Player("Test");
        Match match = new Match(firstPlayer,secondPlayer);
        p.setScore(3);
        match.addScore(p);

    }
    @Test
    public void addScoreTest2(){
        Player firstPlayer = new Player("Test");
        firstPlayer.setScore(3);
        Player secondPlayer = new Player("Sample");
        secondPlayer.setScore(3);
        Player p = new Player("Test1");
        Match match = new Match(firstPlayer,secondPlayer);
        p.setScore(3);
        match.addScore(p);

    }
    @Test
    public void addScoreTest3(){
        Player firstPlayer = new Player("Test");
        firstPlayer.setScore(3);
        Player secondPlayer = new Player("Sample");
        secondPlayer.setScore(2);
        Player p = new Player("Test1");
        Match match = new Match(firstPlayer,secondPlayer);
        p.setScore(3);
        match.addScore(p);
    }

    @Test
    public void addScoreTest4(){
        Player firstPlayer = new Player("Test");
        firstPlayer.setScore(6);
        Player secondPlayer = new Player("Sample");
        secondPlayer.setScore(3);
        Player p = new Player("Test");
        Match match = new Match(firstPlayer,secondPlayer);
        p.setScore(3);
        match.addScore(p);
    }

    @Test
    public void addScoreTest5(){
        Player firstPlayer = new Player("Test");
        firstPlayer.setScore(3);
        Player secondPlayer = new Player("Sample");
        secondPlayer.setScore(6);
        Player p = new Player("Test");
        Match match = new Match(firstPlayer,secondPlayer);
        p.setScore(3);
        match.addScore(p);
    }

    @Test
    public void printScore(){
        Player firstPlayer = new Player("Test");
        firstPlayer.setScoreList(Arrays.asList(0,15,15,30));
        Player secondPlayer = new Player("Sample");
        secondPlayer.setScoreList(Arrays.asList(0,15,15,30));
        Match match = new Match(firstPlayer,secondPlayer);
        match.printPoint();

    }

}