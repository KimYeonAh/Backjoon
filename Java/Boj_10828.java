mport java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        String[] strArr = new String[2];
        String str = "";

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            strArr = str.split(" ");
            switch (strArr[0]){
                case "push" : stack.push(Integer.parseInt(strArr[1]));
                            break;
                case "pop" : if(stack.isEmpty()) System.out.println(-1);
                            else System.out.println(stack.pop());
                            break;
                case "size" : System.out.println(stack.size());
                            break;
                case "empty" : if(stack.isEmpty()) System.out.println(1);
                            else System.out.println(0);
                            break;
                case "top" : if(stack.isEmpty()) System.out.println(-1);
                            else System.out.println(stack.peek());
                            break;
            }
        }
    }
}
