public class rotateArray {
      public static int search(int arr[], int tar, int si, int ei){
            //BASE 
            if(si > ei){
                  return -1;
            }
            //mid
            int mid = si + (ei-si)/2;
            if(arr[mid] == tar){
                  return mid;
            }
            //line 1
            if(arr[si] <= arr[mid]){
                  if(arr[si]<=tar && tar <= arr[mid]){
                        return search(arr, tar, si, mid-1);
                  } else{
                        return search(arr, tar, mid+1, ei);
                  }
            }
            //line 2
            else{
                  if(arr[mid]<=tar && tar <= arr[ei]){
                        return search(arr, tar, mid+1, ei);
                  } else{
                        return search(arr, tar, si, mid-1);
                  }
            }
      }
      public static void main(String[] args) {
            int arr[] = {4,5,6,7,0,1,2};
            int target = 7;

            int tarIdx = search(arr, target, 0, arr.length-1);
            System.out.println(" The value of tagrget index : " +tarIdx);
      }
}
