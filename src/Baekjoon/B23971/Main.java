package Baekjoon.B23971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h, w, n, m;

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int col, row;

        if(h%(n+1) != 0) col = (h/(n+1)) + 1;
        else col = (h/(n+1));

        if(w%(m+1) != 0) row = (w/(m+1)) + 1;
        else row = (w/(m+1));

        System.out.println(col * row);
    }
}
