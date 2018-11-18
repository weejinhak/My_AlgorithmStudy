package Shin.UML;

public class Tennis extends Net implements Hand {

    public Tennis(int max_player) {
        super(max_player);
    }

    @Override
    public void handtool(String toolName) {
        System.out.println("용품" + toolName);
    }

    public String toString() {
        return "테니스";
    }
}
