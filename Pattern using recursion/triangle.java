public class triangle {
      public static void main(String[] args) {
            triangles(4, 0);
      }
      static void triangles(int r, int c){
            if(r==0){
                  return;
            }
            if(c<r){
                  System.out.print("*");
                  triangles(r, c+1);
            } else{
                  System.out.println();
                  triangles(r-1, 0);
            }
      }
}
