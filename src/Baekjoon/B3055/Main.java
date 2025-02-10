//3055 bfs
package Baekjoon.B3055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static char[][] map;
    static int[][] visited;
    static int[][] w_visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int R, C, ans = -1;
    static Queue<Pair> q = new LinkedList<>();
    static Queue<Pair> wq = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new int[R][C];
        w_visited = new int[R][C];

        for(int i = 0; i < R; i++) {
            String s = br.readLine();
            for(int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);

                if(map[i][j] == '*') {
                    wq.add(new Pair(i, j));
                    w_visited[i][j] = 1;
                }
                else if(map[i][j] == 'S') {
                    q.add(new Pair(i, j));
                    visited[i][j] = 0;
                }
            }
        }

        bfs();

        System.out.println(ans == -1 ? "KAKTUS" : ans);
    }

    public static void bfs(){
        while(true){

            int w_size = wq.size();
            for(int k = 0; k < w_size; k++) {
                Pair cur = wq.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];

                    if (nx < 0 || ny < 0 || nx > R - 1 || ny > C - 1) continue;
                    if (w_visited[nx][ny] == 0 && map[nx][ny] == '.') {
                        w_visited[nx][ny] = 1;
                        wq.add(new Pair(nx, ny));
                    }
                }
            }

            int size = q.size();
            if(size == 0) break;
            for(int k = 0; k < size; k++) {
                Pair cur = q.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];

                    if (nx < 0 || ny < 0 || nx > R - 1 || ny > C - 1) continue;
                    if (map[nx][ny] == 'D') {
                        ans = visited[cur.x][cur.y] + 1;
                        return;
                    }

                    if (visited[nx][ny] == 0 && w_visited[nx][ny] == 0 && map[nx][ny] == '.') {
                        visited[nx][ny] = visited[cur.x][cur.y] + 1;
                        q.add(new Pair(nx, ny));
                    }
                }
            }
        }
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
