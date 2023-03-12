import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long result = 0;
        long[] arr = new long[N + 1];
        long[] cnt = new long[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % M;
            if(arr[i] == 0) {
                result++;
            }
            cnt[(int) arr[i]]++;
        }

        for(int i = 0; i < M; i++) {
            if(cnt[i] > 1) {
                result += (cnt[i] * (cnt[i]-1) / 2);
            }
        }
        System.out.println(result);
    }
}

/*
초기 작성 시간초과 코드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = arr[i-1] + Long.parseLong(st.nextToken());
        }

        int start = 1, end = 0;
        long sum = 0, count = 0;

        while(start <= N){
            if (end < N){
                ++end;
                if((arr[end]-sum) % M == 0){
                    // System.out.println("arr : " + start + " arr-sum : " + (arr[end]-sum));
                    count++;
                }
            }else if (end == N){
                sum = arr[start];
                start++;
                end = start-1;
            }
        }
        System.out.println(count);
    }
}
*/
