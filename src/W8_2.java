import java.io.*;
import java.util.ArrayList;

public class W8_2
 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String input[] = br.readLine().split(" ");
    ArrayList<Integer> list = new ArrayList<>(N);

    for(int i = 0; i < N; i++) {
      list.add(Integer.parseInt(input[i]));
    }

    for(int i = 0; i < N; i++) {
      int result = 0;
      for(int j = 0; j < i; j++) {
        Boolean isVisible = true;
        for(int k = j + 1; k < i ; k++) {
          if(list.get(i) >= list.get(j)) {
            if(list.get(j) <= list.get(k)) {
              isVisible = false;
              break;
            };
          }

          if(list.get(i) < list.get(j)) {
            if(list.get(j) <= list.get(k)) {
              isVisible = false;
              break;
            };
          }

        }

        if(isVisible) result++;
      }
      System.out.print(result + " ");
    }
  }
}