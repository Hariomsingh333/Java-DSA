import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 3, 2, 34, 567, 8, 94, 12345, 890, 0 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // public static void selection(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // // find the max element is the arr and swap at the right postion
    // int last = arr.length - i - 1;
    // int maxIndex = getMaxIndex(arr, 0, last);
    // // swap
    // swap(arr, maxIndex, last);
    // }
    // }

    // public static int getMaxIndex(int[] arr, int start, int end) {
    // int max = start;
    // for (int i = start; i <= end; i++) {
    // if (arr[max] < arr[i]) {
    // // get the max item
    // max = i;
    // }
    // }
    // return max;
    // }

    // public static void swap(int[] arr, int first, int second) {

    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;

    // }
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}
