import java.io.*;
import java.util.*;

public class Main {
    
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i <= N; i ++){
            list[i] = new ArrayList();
        }
        
        for(int i = 0;i < M; i ++) {
		    st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			list[from].add(to);
            list[to].add(from);
		}

        int count = 0;
   
        for(int startNode = 1; startNode <= N; startNode++){
            if(!visited[startNode]){
                BFS(startNode);
                count++;
            }
        }
        System.out.println(count);
    }
    private static void BFS(int startNode){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()){
            int currNode = queue.poll();
            for (int node : list[currNode]){
                if(!visited[node]){
                    queue.offer(node);
                    visited[node] = true;
                }
            }
        }
    }
}
