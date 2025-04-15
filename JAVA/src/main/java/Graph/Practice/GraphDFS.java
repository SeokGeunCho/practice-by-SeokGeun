package Graph.Practice;

import java.util.*;

public class GraphDFS {
    // 그래프 데이터를 담는 Map 선언 (정점 → 인접 정점 목록)
    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        // ✅ 1. 방향 그래프 구성
        graph.put("A", Arrays.asList("B", "C")); // A → B, C
        graph.put("B", Arrays.asList("D"));      // B → D
        graph.put("C", Arrays.asList("E"));      // C → E
        graph.put("D", Arrays.asList());         // D는 자식 없음
        graph.put("E", Arrays.asList());         // E도 자식 없음

        // ✅ 2. DFS 탐색 시작
        System.out.println("DFS 탐색 순서: ");
        dfs("A", new HashSet<>());
    }

    // ✅ 3. DFS(깊이 우선 탐색) 함수
    static void dfs(String node, Set<String> visited) {
        // 이미 방문한 노드면 다시 가지 않음
        if (visited.contains(node)) return;

        // 방문 처리
        visited.add(node);
        System.out.println(node + " "); // 현재 노드 출력

        // 인접한 모든 노드에 대해 DFS 재귀 호출
        for (String neighbor : graph.get(node)) {
            dfs(neighbor, visited);
        }
    }
}
/* 🧠 그림으로 정리한 방향 그래프 구조

   코드 복사
        A
       / \
      B   C
      |    \
      D     E
   A는 B와 C를 가리킴
   B는 D를 가리킴
   C는 E를 가리킴
   D와 E는 더 이상 갈 곳이 없음

🟢 DFS 흐름 순서
DFS는 깊이 우선 탐색(Depth-First Search) 이라서
한 방향으로 끝까지 가고, 막히면 뒤로 돌아가서 다른 길을 탐색해요.

탐색 순서는 다음과 같아요: A → B → D → C → E

이유는?
1. A부터 시작해서
2. A의 첫 번째 이웃인 B로 감
3. B의 첫 번째 이웃인 D로 감
4. D는 더 이상 자식이 없음 (되돌아감)
5. A의 두 번째 이웃인 C로 감
6. C의 첫 번째 이웃인 E로 감

    */