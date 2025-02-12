//5014 bfs
package Baekjoon.B5014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int[] dir = new int[2];
        dir[0] = Integer.parseInt(st.nextToken());
        dir[1] = -Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[F + 1];

        q.add(S);
        visited[S] = 1;

        while(!q.isEmpty()) {
            int cur = q.poll();

            if(cur == G){
                System.out.println(visited[cur] - 1);
                return;
            }

            for(int i = 0; i < 2; i++){
                int next = cur + dir[i];

                if(next > F || next < 1) continue;

                if(visited[next] == 0){
                    visited[next] = visited[cur] + 1;
                    q.add(next);
                }
            }
        }

        System.out.println("use the stairs");
    }
}
