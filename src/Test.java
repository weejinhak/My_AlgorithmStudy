public class Test {

    public static void main(String[] args) {

        solution(1, 1);

    }

    private static boolean solution(int x, int y) {

        boolean answer = true;
        int i = 0;
        int all_check = x * y;
        int a = 0, b = 0;

        if (x < 1 || x > 2147483647 || y < 1 || y > 2147483647) {
            return false;
        }

        if (x != 1 && y != 1 && x == y) {
            return false;
        }

        for (i = 0; i < all_check; i++) {
            a++;
            b++;

            if (a == x || b == y) {
                a %= x;
                b %= y;
            }

            if (a == 0 && b == 0 && i != all_check - 1) {
                return false;
            }
        }
        return answer;
    }

}
