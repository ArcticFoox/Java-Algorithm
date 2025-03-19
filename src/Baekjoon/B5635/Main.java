package Baekjoon.B5635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[][] births = new String[N][4];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            births[i][0] = st.nextToken();
            births[i][1] = st.nextToken();
            births[i][2] = st.nextToken();
            births[i][3] = st.nextToken();
        }

        Arrays.sort(births, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[3].equals(o2[3])){
                    if(o1[2].equals(o2[2])){
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
            }
        });

        System.out.println(births[N-1][0] + "\n" + births[0][0]);
    }
}
