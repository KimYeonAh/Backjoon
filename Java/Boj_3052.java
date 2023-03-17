import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
      
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            
            if(!list.contains(num%42)){
                list.add(num%42);
            }
        }
        System.out.println(list.size());
    }
}
