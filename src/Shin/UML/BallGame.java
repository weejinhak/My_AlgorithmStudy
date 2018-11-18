package Shin.UML;

public class BallGame {
    final int MAX_Player;

    public BallGame(int max_player) {
        MAX_Player = max_player;
    }

    void getPrint(BallGame b) {
        System.out.println(b.toString()+":"+b.MAX_Player+"의 선수 필요");
    }
}
