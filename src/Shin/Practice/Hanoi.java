package Shin.Practice;

public class Hanoi {
    public static void main(String[] args) {

        doTower(5, 'A', 'B', 'C');

    }

    private static void doTower(int topN,
                                char from,
                                char inter,
                                char to) {

        if (topN == 1) System.out.println("Disk 1" + from + to);
        else {
            doTower(topN - 1, from, to, inter);
            System.out.println("Disk" + topN + "from" + from + "to" + to);
            doTower(topN - 1, inter, from, to);
        }
    }
}
