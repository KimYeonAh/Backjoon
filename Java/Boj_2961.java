import java.io.*;
import java.util.*;

public class Boj_2961 {

    static int N, min;
    static int[] arr1, arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
        arr1 = new int[N]; 
        arr2 = new int[N];

        for(int i = 0; i < N; i ++){
            st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
            
        }
        min = Math.abs(arr1[0]-arr2[0]);
        subset(0, 0, 1, 0);
        System.out.println(min);
    }

    // cnt : 몇 번째 값을 뽑고 있는지, tCnt : true값 개수, multi : 신맛의 누적곱, sum : 쓴맛의 누적합
    private static void subset(int cnt, int tCnt, int multi, int sum){ 
        
        if (cnt == N){
            if (tCnt != 0){
                min = Math.min(min, Math.abs(multi-sum));
            }
            return;
        }
        
        subset(cnt+1, tCnt+1, multi * arr1[cnt], sum + arr2[cnt]);
        subset(cnt+1, tCnt, multi, sum);

    }
}
