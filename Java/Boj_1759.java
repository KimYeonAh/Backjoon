import java.util.*;
import java.io.*;

public class Main {
    static int L, C;
    static String[] stringList, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        stringList = new String[C];
        result = new String[L];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < C; i++){
            stringList[i] = st.nextToken();
        }
        Arrays.sort(stringList);
        comb(0, 0);
    }

    private static void comb(int cnt, int startIndex){
        if (cnt == L){
            String str = "";
            int m = 0, j = 0;
            for(String num : result) {
                str += num;
                switch(num.charAt(0)) {
                    case 'a' : case'e' : case'i' : case'o' : case'u' :
                        m++;
                        break;
                    default:
                        j++;
                        break;
                }
            }
            if (m >= 1 && j >=2) System.out.println(str);
            return;
        }

        for (int i = startIndex; i < C; i++){
            result[cnt] = stringList[i]; 
            comb(cnt+1, i+1); 
        }
    }
}
