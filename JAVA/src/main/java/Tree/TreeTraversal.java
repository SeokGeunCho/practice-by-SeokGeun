// /*
// ✅ 트리 순회(Tree Traversal)란?
// 트리 구조의 모든 노드를 체계적으로 한 번씩 방문하는 방법
// 순회 방식에 따라 처리 결과가 달라지기 때문에, 어떤 순회를 쓸지에 따라 알고리즘 성능이나 로직이 달라질 수 있어!
//
// 📌 순회의 종류 (3가지 핵심 + 1가지 확장)
// 순회 방식	            설명	                                  방문 순서               용도
// 전위 순회 (Pre-order)	루트 → 왼쪽 → 오른쪽	                  R → L → R          이진 탐색 트리 정렬
// 중위 순회 (In-order)	    왼쪽 → 루트 → 오른쪽	                  L → R → R          구조 저장, 복원
// 후위 순회 (Post-order)	왼쪽 → 오른쪽 → 루트	                  L → R → R          삭제, 평가 계산
// 레벨 순회 (Level-order)	위에서 아래, 왼쪽에서 오른쪽 (BFS 기반)	  큐 사용             BFS, 최단 경로 탐색
//
// ✅ 예제 트리 구조
//
// 코드 복사
//         A
//        / \
//       B   C
//      / \
//     D   E
//
// ▶ 전위 순회 (Pre-order)
// A → B → D → E → C
//
// ▶ 중위 순회 (In-order)
// D → B → E → A → C
//
// ▶ 후위 순회 (Post-order)
// D → E → B → C → A
//
//
// 🧠 기억 꿀팁 (순서 암기)
// 이름	                순서 기억법
// 전위 Pre	         루프가 Pre(먼저) 나온다
// 중위 In	         루트가 In(중간)
// 후위 Post	     루트가 Post(마지막)         */
//
// package Tree;
//
// // 트리 노드를 정의하는 클래스
// class TreeNode {
//     String data;           // 노드 안에 저장할 데이터 (문자열)
//     treenode left, right;  // 왼쪽 자식 노드, 오른쪽 자식 노드
//
//     // 생성자 (노드를 만들 때 데이터 값을 설정)
//     TreeNode(String data) {
//         this.data = data;
//     }
// }
//
// // 트리 순회를 실행하는 메인 클래스
// public class TreeTraversal {
//
//     public static void main(String[] args) {
//         // 트리 구성 시작
//         treenode A = new treenode("A"); // 루트 노드
//         treenode B = new treenode("B");
//         treenode C = new treenode("C");
//         treenode D = new treenode("D");
//         treenode E = new treenode("E");
//
//         // 트리 구조 연결
//         A.left = B;    // A의 왼쪽 자식은 B
//         A.right = C;   // A의 오른쪽 자식은 C
//         B.left = D;    // B의 왼쪽 자식은 D
//         B.right = E;   // B의 오른쪽 자식은 E
//
//         // 구조:
//         //       A
//         //      / \
//         //     B   C
//         //    / \
//         //   D   E
//
//         System.out.print("전위 순회: ");
//         preorder(A);  // 출력: A B D E C
//
//         System.out.print("\n중위 순회: ");
//         inorder(A);   // 출력: D B E A C
//
//         System.out.print("\n후위 순회: ");
//         postorder(A); // 출력: D E B C A
//     }
//
//     // 전위 순회: 루트 → 왼쪽 → 오른쪽
//     public static void preorder(treenode node) {
//         if (node == null) return;             // 노드가 없으면 종료
//         System.out.print(node.data + " ");    // 루트 먼저 출력
//         preorder(node.left);                  // 왼쪽 자식 순회
//         preorder(node.right);                 // 오른쪽 자식 순회
//     }
//
//     // 중위 순회: 왼쪽 → 루트 → 오른쪽
//     public static void inorder(treenode node) {
//         if (node == null) return;             // 노드가 없으면 종료
//         inorder(node.left);                   // 왼쪽 자식 먼저 순회
//         System.out.print(node.data + " ");    // 루트 출력
//         inorder(node.right);                  // 오른쪽 자식 순회
//     }
//
//
//     // 후위 순회: 왼쪽 → 오른쪽 → 루트
//     public static void postorder(treenode node) {
//         if (node == null) return;             // 노드가 없으면 종료
//         postorder(node.left);                 // 왼쪽 자식 순회
//         postorder(node.right);                // 오른쪽 자식 순회
//         System.out.print(node.data + " ");    // 루트 마지막에 출력
//     }
// }



