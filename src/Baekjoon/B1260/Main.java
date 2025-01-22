package Baekjoon.B1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N + 1][N + 1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        bfs(graph, V);

    }

    static void bfs(int[][] graph, int st){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length + 1];
        Arrays.fill(visited, false);

        queue.add(st);
        sb.append(st).append(" ");

        while(!queue.isEmpty()){
            int cur = queue.poll();

            for(int i = 1; i < graph[cur].length; i++){
                if(!visited[i] && graph[cur][i] == 1){
                    sb.append(i).append(" ");
                    queue.add(i);
                }
            }
        }

        System.out.println(sb);
    }
}
