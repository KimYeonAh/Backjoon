import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList();
        String str ="<";

        for(int i = 1 ; i <= N; i ++){
            que.offer(i);
        }

        while(!que.isEmpty()){
            for(int i = 0; i < K-1; i++){
                que.offer(que.poll());
            }
            str += que.poll();
            if (que.size() > 0) str += ", ";
            else if (que.size() == 0) str += ">";
        }
        System.out.println(str);
    }
}
