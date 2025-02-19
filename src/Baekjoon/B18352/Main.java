//18352 graph(bfs)
package Baekjoon.B18352;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[N+1];
        for(int i = 0; i < N+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }

        int[] dis = new int[N+1];
        Arrays.fill(dis, -1);
        dis[X] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(X);

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int next : graph[cur]){
                if(dis[next] == -1){
                    dis[next] = dis[cur] + 1;
                    q.add(next);
                }
            }
        }

        boolean flag = false;
        for(int i = 1; i <= N; i++){
            if(dis[i] == K){
                System.out.println(i);
                flag = true;
            }
        }

        if(!flag){
            System.out.println(-1);
        }
    }
}
