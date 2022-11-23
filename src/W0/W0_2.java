/*
[예시] [복습문제] 2. 카드 교환하기

[문제]

1부터 N까지의 번호를 가진 N명의 사람이 있다. 각 사람들은 1부터  N사이의 
임의의 수 가 쓰여있는 카드를 한 장씩 가지고 있다.

사람들 간에는 총 M쌍의 친구 관계가 있다. 모든 친구 관계는 양방향이라서, 
a번 사람과 b번 사람이 친구라면 b번 사람과 a번 사람도 친구이다. 서로 친구 
관계에 있는 두 사람끼리는 서로 들고 있는 카드를 원하는 만큼 교환할 수 있다.

모든 사람들은 각자가 들고 있는 카드에 적힌 수가 자신의 번호와 최대한 
비슷하기를 원한다. 어떤 한 사람의 불만족도를 그 사람이 들고 있는 카드에 적힌 
수와 그 사람의 번호와의 차이로 정의하고, 전체 불만족도는 모든 사람의 
불만족도의 합으로 정의한다.

카드 교환이 적절하게 이루어졌을 때, 가능한 전체 불만족도의 최솟값을 구하라.

[입력]]

첫째 줄에는 사람의 수 N(1 <= N <= 200,000) 과 친구 관계의 수 
M (0 <= M <= min(N(N-1)/2,500,000)) 이 공백으로 구분되어 주어진다.

둘째 줄에는 N개의 C (1<= C <= N) 가 공백으로 구분되어 주어진다. C는 i번 
사람이 처음에 들고 있는 카드에 적힌 수를 의미한다.

다음 M개의 줄에는 친구 관계의 정보 u, v(1 <= u < v <= N)가 공백으로 구분되어 주어진다. 
이는 u번 사람과 v번 사람이 친구 관계에 있음을 의미한다. 모든 친구 관계는 양방향이고, 
같은 친구 관계가 중복으로 주어지지 않는다. 

입력에서 주어지는 모든 수는 양의 정수이다.
*/

package W0;

import java.io.*;
import java.util.*;

public class W0_2 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
}