package Graph;

import java.util.*; // List, ArrayList, Scanner 등 유틸리티 클래스 사용을 위한 import

public class GraphExample {
    // 그래프를 인접 리스트로 표현 (노드별 연결된 노드 리스트 저장)
    static List<List<Integer>> graph = new ArrayList<>();
    // 방문 체크 배열: 해당 노드를 이미 방문했는지 표시
    static boolean[] visited;

    public static void main(String[] args) {
        int n = 4;  // 노드(정점) 개수는 4개 (0번 ~ 3번)
        visited = new boolean[n]; // 방문 여부를 저장할 배열 초기화 (false로 시작)

        // 그래프 리스트 초기화: 각 정점마다 연결 리스트 만들어줌 (0~3)
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>()); // graph[0], graph[1], ..., graph[3] 생성
        }

        // 간선(edge) 추가 (방향 그래프이므로 단방향 연결)
        graph.get(0).add(1); // 0 → 1
        graph.get(0).add(2); // 0 → 2
        graph.get(1).add(2); // 1 → 2
        graph.get(2).add(0); // 2 → 0
        graph.get(2).add(3); // 2 → 3
        graph.get(3).add(3); // 3 → 3 (자기 자신과 연결된 루프)

        // DFS 탐색 실행 (2번 노드부터 시작)
        System.out.println("DFS 탐색 순서:");
        dfs(2);  // 깊이 우선 탐색 시작 노드 = 2번
    }

    // ✅ DFS (깊이 우선 탐색)
    public static void dfs(int node) {
        visited[node] = true;  // 현재 노드를 방문했다고 표시
        System.out.print(node + " "); // 현재 노드 출력

        // 현재 노드와 연결된 모든 이웃 노드들 탐색
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) { // 아직 방문하지 않은 이웃이라면
                dfs(neighbor);  // 그 이웃 노드로 재귀 호출 (깊이 탐색 계속)
            }
        }
    }
}

/* ✅ 출력 결과
DFS 탐색 순서:
2 0 1 3   */