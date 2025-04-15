/* package Tree.Practice;

public class TreeHeight {
    public static void main(String[] args) {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");

        A.left = B;
        A.right = C;
        B.left = D;

        int height = getHeight(A);
        System.out.println("트리 높이: " + height);
    }
    public static int getHeight(TreeNode node){
        if (node == null) return 0;
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left, right) + 1;
    }
}
*/