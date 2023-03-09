import java.util.Scanner;

public class Boj_11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N+1];
		int[] S = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			S[i] = S[i-1] + sc.nextInt(); 
		}
		
		for (int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			System.out.println(S[end] - S[start-1]);
		}
	}
}
