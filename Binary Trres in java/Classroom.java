

public class Classroom {
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

      public static int height(Node root){
            if(root == null){
                  return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(rh, rh)+1;
      }

      //private Node root;

      public static boolean isEmpty(Node root){
            return root == null;
      }

      public static int count(Node root){
            if(root==null){
                  return 0;
            }
            int LC = count(root.left);
            int RC = count(root.right);
            return LC + RC + 1;
      }

      public static int Sum(Node root){
            if(root==null){
                  return 0;
            }
            int LS = Sum(root.left);
            int RS = Sum(root.right);
            return  LS + RS + root.data;
      }

      public static int Diameter(Node root){
            if(root==null){
                  return 0;
            }
            int leftDiam = Diameter(root.left);
            int leftHeight = height(root.left);
            int rightDiam = Diameter(root.right);
            int rightHeight = height(root.right);

            int selfDiam = leftHeight + rightHeight + 1;

            return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
      }

      public static boolean isIdentical(Node node, Node subRoot){
            if(node==null && subRoot==null){
                  return true;
            } else if(node==null || subRoot==null || node.data != subRoot.data){
                  return false;
            }
            if(!isIdentical(node.left, subRoot.left)){
                  return false;
            }
            if(!isIdentical(node.right, subRoot.right)){
                  return false;
            }
            return true;
      }
/* 
      //Top View Of tree
      public class Info{
            Node node;
            int hd;

            public Info(Node node, int hd){
                  this.node=node;
                  this.hd=hd;
            }
      }
      public static void topView(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min=0, max=0;
            q.add(new Info(root, 0));
            q.add(null);
      }*/

      public static boolean isSubtree(Node root, Node subRoot){
            if(root==null){
                  return false;
            }
            if(root.data == subRoot.data){
                  if(isIdentical(root, subRoot)){
                        return true;
                  }
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
      }
      public static void KLevel(Node root, int level, int k){
            if(root == null){
                  return;
            }

            if(level == k){
                  System.out.print(root.data + " ");
                  return;
            }
            KLevel(root.left, level+1, k);
            KLevel(root.right, level+1, k);
      }

      public static Node lca2(Node root, int n1, int n2){
            
            if(root == null || root.data == n1 || root.data == n2){
                  return root;
            }

            Node leftLCA = lca2(root.left, n1, n2);
            Node rightLCA = lca2(root.right, n1, n2);

            if(leftLCA == null){
                  return leftLCA;
            }

            if(rightLCA == null){
                  return rightLCA;
            }
            return root;
      }

      public static int localDist(Node root, int n){
            if(root==null){
                  return -1;
            }
            if(root.data==n){
                  return 0;
            }
            int leftDist = localDist(root.left, n);
            int rightDist = localDist(root.right, n);

            if(leftDist == -1 && rightDist == -1){
                  return -1;
            } else if(leftDist == -1){
                  return rightDist+1;
            } else{
                  return leftDist+1;
            }
      }

      public static int minDist(Node root, int n1, int n2){
            Node lca = lca2(root, n1, n2);
            int dist1 = localDist(lca, n1);
            int dist2 = localDist(lca, n2);

            return dist1 + dist2;
      }

      

      public static void main(String[] args) {
 /*         1
           / \
          2   3
         / \ / \
        4  5 6  7 
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
/* 
                 2
                / \
               4   5
*/
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Height of Tree is : " + height(root));

        System.out.println("Root empty or Not : " + isEmpty(root));

        System.out.println("Count of tree Nodes : " + count(root));

        System.out.println("Sum of Nodes : " + Sum(root));
        
        System.out.println("Diameter Of Tree : " + Diameter(root));

        System.out.println(isSubtree(root, subRoot));


        int k =3;
        KLevel(root, 1, k);

        /*int n1=4, n2=7;
        System.out.println(lca2(root, n1, n2).data);*/
      System.out.println();
      
      int n1=4, n2=5;
        System.out.println(minDist(root, n1 , n2));
      }
}
