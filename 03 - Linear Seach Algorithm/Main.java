
public class Main{
    public static void main(String[] args) {
        int arr [] = {45, 55 , 65 , 89 , 85 , 75, 33};
int target = 45;
System.out.println(linearSearch(arr, target));
    }
    
    // Linear Search 
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    public static int linearSearch (int arr[], int target){
        if(arr.length ==0){
            return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index
           int element = arr[i]; 
           if(element == target){
                return i;
           }
        }
        // if not found any element 
        return -1;
    }
}