import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int end = 1, start = 1;
		int count = 0, sum = 1;
		
		while(end <= N) {
			
			if(sum > N) {
				start++;
				sum -= start-1;
			}else if(sum == N) {
				count++; start++; end++;
				sum -= start-1;
				sum += end;

			}else if(sum < N) {
				end++;
				sum += end;
			}
		}
		System.out.println(count);
	}
}
