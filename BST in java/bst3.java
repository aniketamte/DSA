
import java.util.ArrayList;

public class bst3{
      static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                  this.data=data;
                  this.left = this.right = null;
            }
      }

      public static void preOrder(Node root){
            if(root==null){
                  return;
            }
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
      }

      //Sorted array to balanced BST
      public static Node createBST(int arr[], int si, int ei){
            if(si > ei){
                  return null;
            }
            int mid = (si + ei)/2;
            Node root = new Node(arr[mid]);
            root.left = createBST(arr, si, mid-1);
            root.right = createBST(arr, mid+1, ei);
            return root;
      }

      //Convert BST to Balanced BST

      public static void getInorder(Node root,  ArrayList<Integer> inorder){
            if(root==null){
                  return;
            }
            getInorder(root.left, inorder);
            inorder.add(root.data);
            getInorder(root.right, inorder);
      }

      public static Node CreateBST(ArrayList<Integer> inorder, int si, int ei){
            if(si > ei){
                  return null;
            }
            int mid = (si + ei)/2;
            Node root = new Node(inorder.get(mid));
            root.left = CreateBST(inorder, si, mid-1);
            root.right = CreateBST(inorder, mid+1, ei);
            return root;
      }

      public static Node balanceBST(Node root){
            //Inorder Sequence
            ArrayList<Integer> inorder = new ArrayList<>();

            getInorder(root, inorder);

            //Sorted Inorder -> balanced BST
            
            root = CreateBST(inorder, 0, inorder.size()-1);

            return root;
      }

      public static void main(String[] args) {
            /* int arr[] = {3,5,6,8,10,11,12};

            Node root = createBST(arr, 0, arr.length-1);
            preOrder(root); */

            Node root = new Node(8);
            root.left =new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);

            root.right = new Node(10);
            root.right.right = new Node(11);
             root.right.right.right = new Node(12);

             root = balanceBST(root);
             preOrder(root);
      }
}