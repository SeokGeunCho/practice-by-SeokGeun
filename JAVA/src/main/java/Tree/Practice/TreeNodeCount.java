/*  package Tree.Practice;

class treeNode {
    String data;
    treeNode left, right;

    public treeNode(String data) {
        this.data = data;
    }
}
public class TreeNodeCount {
    public static void main(String[] args) {
        treeNode A = new treeNode("A");
        treeNode B = new treeNode("B");
        treeNode C = new treeNode("C");
        treeNode D = new treeNode("D");
        treeNode E = new treeNode("E");

        A.left = B; A.right = C; B.left = D; B.right = E;

        int count = countNodes(A);
        System.out.println("전체 노드 수: " + count);
    }
    public static int countNodes(treeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
*/