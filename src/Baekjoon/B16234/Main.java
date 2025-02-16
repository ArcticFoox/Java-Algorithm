//16234 implementation
package Baekjoon.B16234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int N, L, R;
    static ArrayList<Pair> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(move());
    }

    public static int move() { //더 이상 인구이동이 일어나지 않을 때까지 반복
        int result = 0;
        while(true) {
            boolean isMove = false;
            visited = new boolean[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(!visited[i][j]) {
                        int sum = bfs(i, j); //bfs탐색으로 열릴 수 있는 국경선 확인 하며 인구 이동할 총 인구수 반환
                        if(list.size() > 1) {
                            changePopulation(sum); //열린 국경선 내의 노드들 인구 변경
                            isMove = true;
                        }
                    }
                }
            }
            if(!isMove) return result;;
            result++;
        }
    }

    static int bfs(int x, int y){
        Queue<Pair> q = new LinkedList<>();
        list = new ArrayList<>();

        q.offer(new Pair(x, y));
        list.add(new Pair(x, y));
        visited[x][y] = true;

        int sum = arr[x][y];
        while(!q.isEmpty()) {
            Pair current = q.poll();

            for(int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                    int diff = Math.abs(arr[current.x][current.y] - arr[nx][ny]);
                    if(L <= diff && diff <= R) {
                        q.offer(new Pair(nx, ny));
                        list.add(new Pair(nx, ny));
                        sum += arr[nx][ny];
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return sum;
    }

    public static void changePopulation(int sum) {
        int avg = sum / list.size();
        for(Pair n : list) {
            arr[n.x][n.y] = avg;
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
