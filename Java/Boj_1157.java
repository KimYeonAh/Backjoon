import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0; char maxChar = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            char tmp = Character.toUpperCase(str.charAt(i));
            
            if(map.containsKey(tmp)) map.put(tmp, map.get(tmp)+1);
            else map.put(tmp, 1);

            if(map.get(tmp) > max) {
                maxChar = tmp;
                max = map.get(tmp);   
            }   
        }
        boolean count = false;
        for (Character keys : map.keySet()) {
            if(maxChar != keys && map.get(keys) == max) {
                count = true;
                break;
            }
        }
        if(count == true) System.out.println("?");
        else System.out.println(maxChar);
    }
}
