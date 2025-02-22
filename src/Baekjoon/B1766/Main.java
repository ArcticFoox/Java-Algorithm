//1766 topological_sort
package Baekjoon.B1766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] indegree = new int[N + 1];
        ArrayList<Integer>[] arr = new ArrayList[N + 1];

        for(int i = 0; i <= N; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a].add(b);
            indegree[b]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 1; i <= N; i++){
            if(indegree[i] == 0){
                pq.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            int cur = pq.poll();
            sb.append(cur + " ");

            for(int n : arr[cur]){
                indegree[n]--;
                if(indegree[n] == 0){
                    pq.add(n);
                }
            }
        }

        System.out.println(sb);
    }
}
