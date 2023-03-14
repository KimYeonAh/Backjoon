import java.util.*;
import java.io.*;

public class Main {
    
    static int[] numbers;
    static boolean[] isSelectied;
    static int N, M;
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[M];
        isSelectied = new boolean[N+1];

        perm(0);
    }

    private static void perm(int cnt){
        if (cnt == M){
            String str = "";
            for(int num : numbers) {
                str += num + " ";
            }
            System.out.println(str);
            return;
        }

        for(int i = 1; i <= N; i++){
            if(isSelectied[i]) continue;

            numbers[cnt] = i;
            isSelectied[i] = true;
            perm(cnt+1);
            isSelectied[i] = false;
        }
    }
}
