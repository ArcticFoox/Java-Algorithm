//1260 dfs&bfs
package Baekjoon.B1260re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        DFS(V);
        Arrays.fill(visited, false);
        System.out.println();
        BFS(V);
    }

    static void DFS(int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 1; i < graph.length; i++){
            if(graph[v][i] == 1 && !visited[i]){
                DFS(i);
            }
        }
    }

    static void BFS(int v){
        visited[v] = true;
        System.out.print(v + " ");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i = 1; i < graph.length; i++){
                if(graph[cur][i] == 1 && !visited[i]){
                    visited[i] = true;
                    System.out.print(i + " ");
                    queue.add(i);
                }
            }
        }
    }
}
