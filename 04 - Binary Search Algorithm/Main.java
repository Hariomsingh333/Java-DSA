public class Main{
    public static void main(String[] args) {
        // 
        int arr[] = {15, 18 , 26 , 36 , 45 , 78 , 81 , 95};
        int target = 78;
        System.out.println(BinarySearch(arr, target));
    }
    public static int BinarySearch(int arr [], int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            // find the middle element 
            // change the start or end based on middle is greater then or less then 
            // if the middle == target return the target
            int middle = (start + end)/ 2; // total/2
            if(target > arr[middle]){
                //target > middle: you search in the right hand side other wise search left
                // change the middle to start
                start = middle +1;
            }else if(target<arr[middle]){
                //target > middle: you search in the right hand side other wise search left
                // change the middle to start
                // here the other wise method work
                // change the end to middle
                end = middle-1;
            }else{
                // ans find
                return middle;
            }
        }
        return -1;
    }
}