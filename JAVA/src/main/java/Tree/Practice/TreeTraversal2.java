/* package Tree.Practice;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    String data;
    TreeNode left;
    TreeNode right;

    TreeNode(String data) {
        this.data = data;
    }
}

public class TreeTraversal2 {

    public static void main(String[] args) {
        // 트리 구성
        treeNode A = new treeNode("A");
        treeNode B = new treeNode("B");
        treeNode C = new treeNode("C");
        treeNode D = new treeNode("D");
        treeNode E = new treeNode("E");
        treeNode F = new treeNode("F");
        treeNode G = new treeNode("G");

        A.left = B; B.left = D; B.right = E;
        A.right = C; C.left = F; C.right = G;

        System.out.print("전위: ");
        preOrder(A);   // 출력: A B D E C F G

        System.out.print("\n중위: ");
        inOrder(A);    // 출력: D B E A F C G

        System.out.print("\n후위: ");
        postOrder(A);  // 출력: D E B F G C A

        System.out.print("\n레벨: ");
        levelOrder(A); // 출력: A B C D E F G
    }

    // 전위 순회
    static void preOrder(treeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // 중위 순회
    static void inOrder(treeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // 후위 순회
    static void postOrder(treeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // 레벨 순회
    static void levelOrder(treeNode root) {
        if (root == null) return;
        Queue<treeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            treeNode cur = queue.poll();
            System.out.print(cur.data + " ");
            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);
        }
    }
}
*/