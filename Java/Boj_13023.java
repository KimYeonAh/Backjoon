package day7.graph;

import java.io.*;
import java.util.*;

public class Boj_13023_ABCDE {

    static boolean[] visited;
    static int tf;
    static ArrayList<ArrayList<Integer>> list;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        list = new ArrayList<>();

        for(int i = 0; i < N; i ++){
            list.add(new ArrayList<>());
        }
        
        for(int i = 0;i < M; i ++) {
		    st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			list.get(from).add(to);
            list.get(to).add(from);
		}

        for (int i = 0; i < N; i++){
            Arrays.fill(visited, false);
            DFS(i, 0);
            if (tf == 1) {
                break;
            }
        }

        System.out.println(tf);

    }

    private static void DFS(int start, int cnt){
        if(cnt >= 4) {
            tf = 1;
            return;
        }
        
        visited[start] = true;
        for (int i : list.get(start)){
            if(!visited[i]){
                DFS(i, cnt+1);
            }

            if(tf == 1){
                return;
            }
        }

        visited[start] = false;
    }
}
