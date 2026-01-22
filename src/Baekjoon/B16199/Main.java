//16199 basic
package Baekjoon.B16199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] birthday = new int[]{Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())};

        st = new StringTokenizer(br.readLine());
        int[] standardDay = new int[]{Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())};

        int dis = standardDay[0] - birthday[0];
        int age1 = birthday[1] > standardDay[1] || (birthday[1] == standardDay[1] && birthday[2] > standardDay[2]) ? dis-1 : dis;
        int age2 = dis+1;
        int age3 = dis;

        System.out.println(age1 +"\n"+age2 +"\n"+age3);
    }
}
