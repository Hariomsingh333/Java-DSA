# 29 / 10 / 2021;

# some Binary search question and answer.

please please don't skip binary search, binary search is very important, it is asked on interview.

## when do we apply binary search?

if you have something with is sorted array try binary search first. most of the time you will get the answer.

## Q1: Ceiling of a givin Number

- what do mean by ceiling of a number
  let see we have an array and a target

```java
int arr[] = {1,2,3,4,5,6,7,9};
int target = 8;
```

Ceiling is = what ?
<br>

**Ceiling is = in this array find the smallest number in this array that is greater than or = to the target number**

```java
int arr[] = {1,2,3,4,6,7,9};
int target = 5;
// find the ceiling
ceiling (arr, target = 5), ceiling = 6
```

target = 4;

- what are greater then or equal to target

  - ans: 4

- step no 1: your have to figure out what is the target (which is givin to you)
- step no 2: find what smallest number is greater then or equal to the target
- step no 3: which is smallest number is this number

### example

```java
int arr [] = {1 , 4  , 5 , 7 , 9};
int target = 3;

// find the ceiling of target
// follow step 1 = find the target (3)
// follow step 2 = find the smallest number is greater then or equal to target (4)
int ceiling = 4;
```

so we can apply binary search in this problem.

### theory

so we have an array

```java
 int arr [] = {2,3,5,9,14,16,18};
//  int target = ?
```

**so lets imagine the ceiling was equal to target is this question is different than a binary search - no.**
<br>

**but now is saying that hey! the only change from a binary search that you will be making is what ? - you will not return -1 this case**

<br>

_if you are not find the element you will be just return the greater element_

### code

```java
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
```

- i just write normal binary search
- just change return -1 to return start;
- that'it
