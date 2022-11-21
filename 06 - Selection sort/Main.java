import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 3, 2 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max element is the arr and swap at the right postion
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            // swap
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                // get the max item
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
