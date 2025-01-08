
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesB {
      static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                  this.data=data;
                  this.left=null;
                  this.right=null;
            }
      }

      static class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int nodes[]){
                  idx++;
                  if(nodes[idx] == -1){
                        return null;
                  }
                  Node newNode = new Node(nodes[idx]);
                  newNode.left = buildTree(nodes);
                  newNode.right=buildTree(nodes);

                  return newNode;
            }
      
      public static void preOreder(Node root){
            if(root==null){
                  return;
            }
            System.out.print(root.data + " ");
            preOreder(root.left);
            preOreder(root.right);
      }

      public static void inOrder(Node root){
            if(root == null){
                  return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
      }

      public static void postOrder(Node root){
            if(root==null){
                  return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
      }

      public static void levelOrder(Node root){
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
      }


}
      public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(root);
            System.out.println("Root Node is : " + root.data);
            System.out.println("Pre order Traversal : ");
            tree.preOreder(root);
            System.out.println();
            System.out.println("In order Traversal: ");
            tree.inOrder(root);
            System.out.println();
            System.out.println("Post Order Traversal : ");
            tree.postOrder(root);
            System.out.println();
            System.out.println("Level Order Traversal : ");
            tree.levelOrder(root);
      }
}
