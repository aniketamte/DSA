
public class maxandmin {

    static int max(int arr[]) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int min(int arr[]) {
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28};
        System.out.println("Maximum Value : " + max(arr));
        System.out.println("Minimum Value : " + min(arr));
    }
}
