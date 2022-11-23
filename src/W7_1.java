import java.io.*;
import java.util.*;
import java.util.Map.*;

public class W7_1
 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input[] = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(N);

    for (int i = 0; i < N; i++) {
      map.put(i + 1, 0);
    }

    for (int i = 0; i < M; i++) {
      String eInput[] = br.readLine().split(" ");
      int eCount = Integer.parseInt(eInput[0]);

      for (int j = 1; j < eCount + 1; j++) {
        int eNum = Integer.parseInt(eInput[j]);
        map.put(eNum, map.get(eNum) + 1);
      }
    }

    System.out.println(getResult(map));
  }

  public static String getResult(HashMap<Integer, Integer> map) {
    String result = "";
    ArrayList<Integer> list = new ArrayList<>();
    Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {
      @Override
      public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
        return e1.getValue().compareTo(e2.getValue());
      }
    };

    Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue().equals(maxEntry.getValue()))
        list.add(entry.getKey());
    }

    Collections.sort(list, Collections.reverseOrder());

    for (int i : list) {
      result += i + " ";
    }
    return result;
  }
}