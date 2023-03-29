import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        String[] strArr = new String[2];
        String str = "";

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            strArr = str.split(" ");
            switch (strArr[0]){
                case "push" : que.add(Integer.parseInt(strArr[1]));
                            list.add(Integer.parseInt(strArr[1]));
                            break;
                case "pop" : if(que.isEmpty()) System.out.println(-1);
                            else System.out.println(que.poll()); 
                            break;
                case "size" : System.out.println(que.size());
                            break;
                case "empty" : if(que.isEmpty()) System.out.println(1);
                            else System.out.println(0);
                            break;
                case "front" : if(que.isEmpty()) System.out.println(-1);
                            else System.out.println(que.peek());
                            break;
                case "back" : if(que.isEmpty()) System.out.println(-1);
                            else System.out.println(list.get(list.size()-1));
                            break;
            }
        }
    }
}
