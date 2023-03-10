import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList();
		
		for (int i = 1; i < N+1; i++) {
			que.offer(i);
		}
		
		boolean bool = false;
		while(que.size()>1) {
			if (bool == false) {
				que.poll();
				bool = true;
			}else {
				que.offer(que.poll());
				bool = false;
			}
		}
		
		System.out.println(que.poll());
	}

}
