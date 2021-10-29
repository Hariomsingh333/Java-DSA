public class Question {
    public static void main(String[] args) {
        // Q1: Ceiling of Number
        int arr [] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceilingBinaarySearch(arr, target)); // 5 ans
    }    
    public static int ceilingBinaarySearch(int arr [], int target){
            int start = 0;
            int end = arr.length -1;
            while(end >= start){
                int mid = (start + end)/2;
                if (target > arr[mid]){
                    start = mid+1;
                }else if(target< arr[mid]){
                    end = mid-1;
                }else {
                    return mid;
                }
            }
            return start;
    }
}
