import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
    
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    
        int max;
        int tmp = 0;
        for(int i = arr.length-1; i >= 1; i --){
            max = i;
            for(int j = i; j >= 0; j--){
                if (arr[max] < arr[j]){
                    max = j;
                }
            }

            tmp = arr[max];
            arr[max] = arr[i];
            arr[i] = tmp;

            if (max != i) K--;
            if (K == 0){
                listPrint(arr);
            }           
        }

        if ( K > 0 ){
            System.out.println(-1);
        }
    }

    public static void listPrint(int[] arr) {
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        System.out.println(result);
    }
}
