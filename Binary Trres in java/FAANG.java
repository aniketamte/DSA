
import java.util.*;
import javax.swing.tree.TreeNode;

public class FAANG {
 //LL => 102 => LevelOrder Traversal
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<List<Integer>> currLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = q.poll();
                currLevel.add(currNode.val);
                if (currNode.left != null) {
                    q.offer(currNode.left);
                }
                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }
            result.add(currLevel);
        }

        return result;
    }

    //LL => 637 => Avg Level in BT
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            double averageLevel = 0;

            for(int i=0; i<levelSize; i++){
                TreeNode currNode = q.poll();
                averageLevel += currNode.val;
                if(currNode.left != null){
                    q.offer(currNode.left);
                }
                if(currNode.right != null){
                    q.offer(currNode.right);
                }
            }
            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }
        return result;
    }

    //LL => 103

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean reverse = false;

        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);

            for(int i=0; i<levelSize; i++){
               if(!reverse){
                TreeNode currNode = q.pollFirst();
                currLevel.add(currLevel.val);
                if(currNode.left != null){
                    q.addLast(currNode.left);
                }
                   if (currNode.right != null) {
                       q.addLast(currNode.right);
                   }
               } else{
                   TreeNode currNode = q.pollBack();
                   currLevel.add(currLevel.val);
                   if (currNode.right != null) {
                       q.addFirst(currNode.right);
                   }
                   if (currNode.left != null) {
                       q.addFirst(currNode.left);
                   }
               }
               reverse = !reverse; 
            }
            result.add(currLevel);
        }
        return result;
    }
}
