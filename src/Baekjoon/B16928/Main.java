package Baekjoon.B16928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int[] map = new int[102];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 1; i < map.length; i++){
            map[i] = i;
        }

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x] = y;
        }
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x] = y;
        }

        int result = bfs(1);
        System.out.println(result);
    }

    public static int bfs(int startNode){
        int[] check = new int[101]; // 방문 순서를 기록하기 위한 배열 생성.
        Queue<Integer> q = new LinkedList<>();
        q.offer(startNode); //처음에 인덱스 1이 들어간다.
        check[startNode] = 0;

        while (true) {
            int visitedNum = q.poll();
            //주사위 1~6이 나오는 경우를 살피기.
            for (int i = 1; i < 7; i++) {
                int newNode = visitedNum + i;

                // board의 범위를 넘기면 무시하기
                // - check 배열에 IndexOutOfBoundsException을 발생시킬 수 있기 때문
                if (newNode > 100) {
                    continue;
                }

                // check되어있는 경우(방문을 한적이 있는 경우)는 무시한다는 것을 전제로 함.
                if (check[map[newNode]] == 0) {
                    q.offer(map[newNode]);
                    check[map[newNode]] = check[visitedNum] + 1;
                }
                if (map[newNode] == 100) {
                    return check[100];
                }
            }
        }
    }
}
