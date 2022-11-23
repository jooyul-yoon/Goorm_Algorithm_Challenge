import java.io.*;
import java.util.ArrayList;

public class W8_3
 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String input[] = br.readLine().split(" ");
    ArrayList<Integer> list = new ArrayList<>();
    int result = 0;

    for(int i = 0; i < N; i++) {
      list.add(Integer.parseInt(input[i]));
    }
  }
}