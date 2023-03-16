import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());        

        int count = N/5;
        int tmp = N%5;

        while(tmp > 0 ){
            if (tmp >= 3 && tmp % 3 == 0) {
                count += tmp/3;
                tmp %= 3;
            }else if(tmp < 3 || tmp % 3 !=0) {
                count -= 1;
                tmp += 5;
                
                if(tmp > N){
                    System.out.println(-1); return;
                }
            }
        }
        System.out.println(count);
    }
}


