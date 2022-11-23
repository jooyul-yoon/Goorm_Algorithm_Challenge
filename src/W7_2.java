import java.io.*;
import java.util.ArrayList;

class W7_2 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();

    ListGraph adjList = new ListGraph(N);

    for (int i = 0; i < M; i++) {
      String relation[] = br.readLine().split(" ");
      int x = Integer.parseInt(relation[0]);
      int y = Integer.parseInt(relation[1]);
      adjList.put(x, y);
    }

    adjList.printGraphToAdjList();
  }
}

class ListGraph {
  private ArrayList<ArrayList<Integer>> listGraph;

  // 그래프 초기화
  public ListGraph(int initSize) {
    this.listGraph = new ArrayList<ArrayList<Integer>>(); // 그래프 생성

    // 그래프 초기화
    // put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수이나
    // ArrayList의 index는 0 부터 시작이므로
    // ArrayIndexOutOfBoundsException 방지를 위해
    // 정점을 담는 인접리스트의 size는 1을 더하여 초기화해줌
    // ex) initSize = 3
    // graph[0]
    // graph[1] -> 2 -> 3
    // graph[2] -> 1 -> 3 -> 4
    // graph[3] -> 1 -> 2 -> 4 -> 5
    for (int i = 0; i < initSize + 1; i++) {
      listGraph.add(new ArrayList<Integer>());
    }
  }

  // 그래프 return
  public ArrayList<ArrayList<Integer>> getGraph() {
    return this.listGraph;
  }

  // 그래프의 특정 노드 return
  public ArrayList<Integer> getNode(int i) {
    return this.listGraph.get(i);
  }

  // 그래프 추가 (양방향)
  public void put(int x, int y) {
    listGraph.get(x).add(y);
    listGraph.get(y).add(x);
  }

  // 그래프 추가 (단방향)
  public void putSingle(int x, int y) {
    listGraph.get(x).add(y);
  }

  // 그래프 출력 (인접리스트)
  public void printGraphToAdjList() {
    for (int i = 1; i < listGraph.size(); i++) {
      System.out.print("정점 " + i + "의 인접리스트");

      for (int j = 0; j < listGraph.get(i).size(); j++) {
        System.out.print(" -> " + listGraph.get(i).get(j));
      }
      System.out.println();
    }
  }
}