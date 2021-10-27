# Date: 27 / 10 / 2021

# Binary Search

# Theory

today we are learning about **Binary Search** and this algorithm is the most asked algorithm. _Very Important_

## What is Binary Search

we are learning about how to search in a optimize way, in linear search we learn how to search but here we learning about how to search in a optimize way.

\*\*Binary Search say that TAKE THE MIDDLE OF THE ELEMENT(index)

let's see in detail
we have an array and find 78 exists on not

```java
// arr

//1   2   3     4    5    6    7   8
[15, 18 , 26 , 36 , 45 , 78 , 81 , 95]
// target 78
// middle 36
// 78 > 36
// search in right hand side[45 , 78 , 81 , 95]
```

- first step
  **find the middle element**_(total/2)_

- second step
  this is key of binary search(pay attention)
  **check the target element > middle: you search in the right hand side other wise search left**

- Third step
  **if middle element == target element, this is my answer**

_let dry run this_

```java
//s             m                   e
//1   2   3     4    5    6    7   8
[15, 18 , 26 , 36 , 45 , 78 , 81 , 95]
// target 78
// middle 36
// 78 > 36
// search in right hand side[45 , 78 , 81 , 95]
```

```java
//s    m        e
//1   2    3    4
[45 , 78 , 81 , 95]
// target 78
// middle 78
// here is my answer
// index[6]
```

# code

## ascending order

```java
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

```

## descending order

```java
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

```

# Order-Agnostic Binary Search

we see how to implement Binary Search in an array, but the array is sorted, but what if the array is not sorted then?
<br>
we know that in Binary Search we work with sorted array in ascending order or descending order
<br>
but what if weather you don't know the array sorted array in ascending order or descending order, how will be apply binary search then.
