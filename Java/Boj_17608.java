import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			stack.push(Integer.parseInt(st.nextToken()));
		}
		
		int max = stack.pop();
		int count = 1;
		while(!stack.isEmpty()) {
			if (max < stack.peek()) {
				max = stack.pop();
				count ++;
			}else {
				stack.pop();
			}
		}
		
		System.out.println(count);
	}

}
