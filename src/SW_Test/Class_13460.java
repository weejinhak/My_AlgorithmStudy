package SW_Test;

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_13460 {

    static final int INF = 987654321;
    static int n, m, ans = INF;
    static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        Point Red = null, Blue = null;

        char[][] a = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
                if (a[i][j] == 'R') Red = new Point(i, j);
                if (a[i][j] == 'B') Blue = new Point(i, j);
            }
        }
        for (int i = 0; i < 4; i++) {
            check(i, 0, a, false, false, Red, Blue);
        }

    }

    private static void check(int dir, int cnt, char[][] map, boolean r, boolean b, Point Red, Point Blue) {
        ++cnt; //check 횟수
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = map[i][j];
        int first = 0;

        switch (dir) {
            case 0:
                if (Red.x > Blue.x) first = 1;
                break;
            case 1:
                if (Red.x < Blue.x) first = 1;
                break;
            case 2:
                if (Red.y > Blue.y) first = 1;
                break;
            case 3:
                if (Red.y < Blue.y) first = 1;
                break;
        }
        if (first == 0) {
            while (true) {
                int nx = Red.x + dx[dir];
                int ny = Red.y + dy[dir];
                if (a[nx][ny] == '#') break;
                if (a[nx][ny] == '0') {
                    a[Red.x][Red.y] = '.';
                    Red = null;
                    r = true;
                    break;
                }
                a[Red.x][Red.y] = '.';
                a[nx][ny] = 'R';
                Red = new Point(nx, ny);
            }
            while (true) {
                int nx = Blue.x + dx[dir];
                int ny = Blue.y + dy[dir];
                if (a[nx][ny] == '#' || a[nx][ny] == 'R') break;
                if (a[nx][ny] == '0') {
                    a[Blue.x][Blue.y] = '.';
                    Blue = null;
                    b = true;
                    break;
                }
                a[Blue.x][Blue.y] = '.';
                a[nx][ny] = 'B';
                Blue = new Point(nx, ny);
            }

        }
        if (first == 1) {
            while (true) {
                int nx = Blue.x + dx[dir];
                int ny = Blue.y + dy[dir];
                if (a[nx][ny] == '#') break;
                if (a[nx][ny] == '0') {
                    a[Blue.x][Blue.y] = '.';
                    Blue = null;
                    b = true;
                    break;
                }
                a[Blue.x][Blue.y] = '.';
                a[nx][ny] = 'B';
                Blue = new Point(nx, ny);
            }
            while (true) {
                int nx = Red.x + dx[dir];
                int ny = Red.y + dy[dir];
                if (a[nx][ny] == '#' || a[nx][ny] == 'B') break;
                if (a[nx][ny] == '0') {
                    a[Red.x][Red.y] = '.';
                    Red = null;
                    r = true;
                    break;
                }
                a[Red.x][Red.y] = '.';
                a[nx][ny] = 'R';
                Red = new Point(nx, ny);
            }
        }
        if (cnt > 10) return;
        if (r && b) return;
        if (!r && !b) {
            ans = Math.min(ans, cnt);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (i == dir || i < reverse(dir)) continue;
            check(i, cnt, a, r, b, Red, Blue);
        }


    }

    private static int reverse(int dir) {
        if (dir == 0) return 1;
        if (dir == 1) return 0;
        if (dir == 2) return 3;
        else return 2;
    }


    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }

}
