
import java.util.*;
import javax.swing.tree.TreeNode;

public class leetcode102 {

    static class Node {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();
            if (currNode == null) 
            {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    
}


/*public static void levelOrder(Node root){
            if(root == null){
                  return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                  Node currNode = q.remove();
                  if(currNode==null){
                        System.out.println();
                        if(q.isEmpty()){
                              break;
                        } else{
                              q.add(null);
                        }
                  } else{
                        System.out.print(currNode.data + " ");
                        if(currNode.left != null){
                              q.add(currNode.left);
                        }
                        if(currNode.right !=  null){
                              q.add(currNode.right);
                        }
                  }
            }
      } */
