//  /*
// 레벨 순회는 위에서 아래로, 왼쪽에서 오른쪽으로 노드를 방문하는 방식이야.
// → 즉, 층 단위로 탐색한다고 보면 돼!
//
// ✅ 레벨 순회 특징
// BFS (Breadth(=width 폭,너비)-First Search) 방식 사용
// 큐(Queue)를 활용해서 각 층의 노드를 순서대로 처리
// 자바에서는 [Queue] 인터페이스 중 [LinkedList]를 사용
//
// 🧩 트리 구조 예시 (동일)
//
//         A
//        / \
//       B   C
//      / \
//     D   E
//
// 🧠 요약 정리
// 구분	                특징
// 탐색 방식	        BFS (너비 우선 탐색)
// 자료구조	            Queue 사용
// 순서	                위 → 아래, 왼쪽 → 오른쪽
// 활용	                최단 경로 탐색, 그래프 탐색, 층별 처리     */
//
// package Tree;
//
// import java.util.LinkedList; // LinkedList: 자바에서 Queue로 사용할 수 있는 대표 클래스
//                              // → Queue<TreeNode> queue = new LinkedList<>();처럼 사용 가능
// import java.util.Queue; // Queue: 큐 자료구조를 사용하기 위한 인터페이스
//
// class treenode {
//     String data; // 노드가 저장할 데이터 (문자열 형태)
//     treenode left, right; // 왼쪽 자식 노드, 오른쪽 자식 노드
//
//     treenode(String data) {
//         this.data = data; // 생성자를 통해 노드의 데이터를 설정
//     /*
//     이 클래스는 트리의 한 "노드"를 의미해. 각 노드는 데이터 + 왼쪽/오른쪽 자식 포인터를 가짐
//      */
//     }
// }
//
// public class LevelOrderTraversal {
//
//     public static void main(String[] args) { // 이 클래스가 실행용 클래스이고, main 메서드에서 트리를 구성하고 순회를 실행해
//         // 트리 구성 : 트리 노드들을 생성하고, 부모와 자식 노드를 연결해
//         treenode A = new treenode("A");
//         treenode B = new treenode("B");
//         treenode C = new treenode("C");
//         treenode D = new treenode("D");
//         treenode E = new treenode("E");
//
//         A.left = B;
//         A.right = C;
//         B.left = D;
//         B.right = E;
// /* 트리 구조는 이렇게 돼:
//         A
//        / \
//       B   C
//      / \
//     D   E                   */
//         // 레벨 순회 실행
//         System.out.print("레벨 순회: ");
//         levelOrder(A);  // 루트 노드 A부터 레벨 순회 실행, 출력: A B C D E
//     }
//
//     // ✅ 레벨 순회 (Level-order)
//     public static void levelOrder(treenode root) { // root부터 시작해서 트리를 순회하는 함수
//         if (root == null) return; // 트리가 비어있을 경우, 아무것도 안 하고 함수 종료
//
//         Queue<treenode> queue = new LinkedList<>(); // Queue를 생성해서 사용할 준비 완료
//         queue.offer(root);  // 루트부터 방문을 시작하기 위해 큐에 넣음
//
//         while (!queue.isEmpty()) { // 큐가 비어있지 않은 동안 (= 아직 방문할 노드가 있을 때까지)
//             treenode current = queue.poll();   // 큐에서 제일 앞에 있는 노드를 꺼냄
//             System.out.print(current.data + " "); // 해당 노드의 data를 출력함
//
//             // 현재 노드의 왼쪽 자식이 있으면 큐에 넣는다
//             if (current.left != null) {
//                 queue.offer(current.left);
//             }
//
//             // 현재 노드의 오른쪽 자식도 있으면 큐에 넣는다
//             if (current.right != null) {
//                 queue.offer(current.right);
//             }
//         }
//     }
// }
// /* ✅ 출력 결과
//
// 레벨 순회: A B C D E
// A (0층) → B, C (1층) → D, E (2층) 순서로 출력됨
//
// **큐(Queue)**를 이용해서 FIFO 순서로 차례차례 탐색함   */
//
// /* 🧠 최종 정리
// 줄	                       의미
// Queue	                너비 우선 탐색을 위한 핵심 구조
// offer()	                큐에 노드를 추가
// poll()	                큐에서 노드를 꺼냄
// if (left/right != null)	자식이 있으면 큐에 등록 */
//