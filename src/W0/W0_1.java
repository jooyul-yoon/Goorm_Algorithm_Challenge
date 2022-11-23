/*
 [예시] [복습문제] 1. 단어장 만들기

[문제]

구르미는 영어 공부를 위해서 개인 단어장을 만들어 컴퓨터에 저장하고 있다. 
영어 공부를 열심히 하다보니, 단어장에서 단어를 찾기가 어려워지자, 구르미는 
n개의 단어를 중 k번에 위치한 단어를 찾는 기능을 구현하려고 한다.

하지만 문제가 생겼다. 구름이의 동생이 단어 데이터베이스를 침입해 정렬된 
단어를 뒤집어 버렸다. 이 문제를 해결하기 위해서 구르미는 섞여져 있는 
단어들을 정렬하고 번에 위치한 단어를 출력하는 기능을 만들고자 한다.

단어를 정렬하는 기준은 길이가 짧을수록 앞에 있고 길이가 같다면, 사전 순으로 정렬한다.

구르미를 도와 해당 기능을 구현해보자.

[입력]

첫 번째 줄에 단어의 개수 n (1<= n <= 2,000,000)와 찾고자 하는 단어의 위치 이 주어진다.

두 번째 줄부터 n줄 동안 단어가 주어진다. 각각의 단어는 영어 소문자로 이루어진 1 이상 
100 이하의 길이를 가진 영어 단어이다.
 */

package W0;

import java.io.*;
import java.util.*;

public class W0_1 {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input[] = br.readLine().split(" ");
      int n = Integer.parseInt(input[0]);
      int k = Integer.parseInt(input[1]);
      String result = "";
      ArrayList<String> list = new ArrayList<>();

      for(int i = 0; i < n; i++) {
        String word = br.readLine();
        list.add(word);
      }

      Collections.sort(list, new Comparator<String>() {
        public int compare(String s1, String s2) {
          if(s1.length() < s2.length()) return -1;
          else if(s1.length() == s2.length()) {
            return s1.compareTo(s2);
          }
          else return 1;
        }
      });

      result = list.get(k - 1);

      System.out.println(result);
  }
}
