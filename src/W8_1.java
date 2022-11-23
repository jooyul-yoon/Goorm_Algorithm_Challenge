import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class W8_1
 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt( br.readLine());
    String str = br.readLine();

    HashMap<Integer, String> map = new HashMap<Integer, String>(10){{
      put(1, "qw");
      put(2, "as");
      put(3, "zx");
      put(4, "we");
      put(5, "sd");
      put(6, "xc");
      put(7, "er");
      put(8, "df");
      put(9, "cv");
      put(0, "ze");
    }};

    for(int i = 0; i < N - 1; i++) {
      for(Entry<Integer, String> entry: map.entrySet()) {
        if(entry.getValue().equals(str.substring(i, i+ 2))) {
          System.out.print(entry.getKey());
        }
      }
    }
  }
}