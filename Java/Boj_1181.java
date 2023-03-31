import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        HashSet<String> strSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            strSet.add(br.readLine());
        }

        String[] strArr = strSet.toArray(new String[0]);
        
        Arrays.sort(strArr, (p1, p2) -> p1.length() == p2.length() ? 
                            p1.compareTo(p2) : p1.length() - p2.length());

        for(String str : strArr) System.out.println(str);
    }
}
