import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int N = Integer.parseInt(st.nextToken());
        int[][] timetable = new int[N][2];

        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
		        timetable[i][0] = Integer.parseInt(st.nextToken());
            timetable[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(timetable, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        int count = 1;
        int start = timetable[0][1];

        for(int i = 1; i < timetable.length; i++){
            if (start <= timetable[i][0]){
                start = timetable[i][1];
                count ++;
            }
        }
        System.out.println(count);
    }
}
