//12891 string(sliding_window)
package Baekjoon.B12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] A = br.readLine().toCharArray();
        int[] checkArr = new int[4];
        int[] myArr = new int[4];
        int result = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < P; i++) {
            if(A[i] == 'A') myArr[0]++;
            if(A[i] == 'C') myArr[1]++;
            if(A[i] == 'G') myArr[2]++;
            if(A[i] == 'T') myArr[3]++;
        }

        if(check(checkArr, myArr)) result++;

        int i = 0;

        for(int j = P; j < S; j++){
            i = j - P;
            if(A[i] == 'A') myArr[0]--;
            if(A[i] == 'C') myArr[1]--;
            if(A[i] == 'G') myArr[2]--;
            if(A[i] == 'T') myArr[3]--;

            if(A[j] == 'A') myArr[0]++;
            if(A[j] == 'C') myArr[1]++;
            if(A[j] == 'G') myArr[2]++;
            if(A[j] == 'T') myArr[3]++;

            if(check(checkArr, myArr)) result++;
        }

        System.out.println(result);
    }

    static boolean check(int[] checkArr, int[] myArr) {
        for (int i = 0; i < 4; i++) {
            if(checkArr[i] > myArr[i]) return false;
        }
        return true;
    }
}
