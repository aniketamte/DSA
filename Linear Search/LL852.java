public class LL852 {
      //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/


      //1095

      int search(int arr[], int target){
            int peak = peakIndexInMountainArray(arr);
            int firstTry = orderAgnosticBS(arr, target, 0, peak);
            if(firstTry != -1){
                  return firstTry;
            }
            return orderAgnosticBS(arr, target, peak, arr.length-1);
      }

        static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

      static int peakIndexInMountainArray(int arr[]){
            int start = 0;
            int end = arr.length-1;

            while (start < end) {
                  int mid = start + (end - start)/2;
                  
                  if(arr[mid] > arr[mid+1]){
                        //It means you are in decreasing part of array
                        end=mid;
                  } else{
                        //if(arr[mid]<arr[mid+1])
                        //you are in ascending part of array
                        start = mid +1;
                  }
            }
            //in the end start==end and pointing to the larget number beacause of 2 checks i.e left and right

            return start;   //you can return end as well
      }
      static int binarySearch(int arr[], int target, int start, int end){
            while(start<=end){
                  int mid = start + (end - start)/2;

                  if(target < arr[mid]){
                        end = mid -1;
                  } else if(target > arr[mid]){
                        start = mid+1;
                  }else{
                        return mid;
                  }
            }
            return  -1;
      }


      public static void main(String[] args) {
            //peek index at mountain array
            int arr[] = {0,1,0};
            int ans = peakIndexInMountainArray(arr);
            System.out.println(ans);
      }
}
