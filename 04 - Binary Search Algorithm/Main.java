public class Main{
    public static void main(String[] args) {
        // ascending order
        // int arr[] = {15, 18 , 26 , 36 , 45 , 78 , 81 , 95};
        // int target = 78;
        // System.out.println(ascendingorder(arr, target));
        // descending order 
        int arr[] = {91 , 88, 74, 62, 51, 48, 36};
        int target = 88;
        System.out.println(descendingorder(arr, target));
    }
    public static int ascendingorder(int arr [], int target){
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

    // descending order
    // target > middle = e = m-1
    // target < middle = s = m+1
    public static int descendingorder(int arr [], int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            int mid = (start + end)/2;
            if (target > arr[mid]){
                end = mid-1;
            }else if(target<arr[mid]){
                start =mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}