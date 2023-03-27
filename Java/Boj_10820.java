import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
        while((str = br.readLine()) != null){
            int lower = 0, upper = 0, num = 0, gap = 0;
            for (int i = 0; i < str.length(); ++i) {
                char tmp = str.charAt(i);
                if(Character.isLowerCase(tmp)) ++lower;
                if(Character.isUpperCase(tmp)) ++upper;
                if(Character.isDigit(tmp)) ++num;
                if(tmp == ' ') ++gap;        
            }
            System.out.println(lower + " " + upper + " " + num + " " + gap);      
        }
    }
}
