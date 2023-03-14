import java.util.*;

public class Main {

    static int N, M;
    static int[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[M];

        comb(0, 1);
    }

    private static void comb(int cnt, int startindex){
        if (cnt == M){
            String str = "";
            for(int num : numbers) {
                str += num + " ";
            }
            System.out.println(str);
            return;
        }

        for (int i = startindex; i <= N; i++){
            numbers[cnt] = i; 
            comb(cnt+1, i+1); 
        }
    }    
}
