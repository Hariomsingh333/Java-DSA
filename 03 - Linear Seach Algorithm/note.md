# Linear Search Algorithm

# Date: 17 / 10 / 2021

Linear Search Algorithm is a array searching algorithm.

### What is Linear Search

let's imagine we have an array like this

```java

int arr [] = {25, 45, 69, 12, 78}

```

and the question is
Q: find weather in the arr array 69 in exists or not
if 69 exists the print the index

**Linear Search is very simple**
Linear Search says that - start Searching from the first element till you find the element looking for.

```java
    //linear seach
//looking for   !i  !i   i
//index         0   1   2   3   4
        arr = [25, 45, 69, 12, 78]
        return (arr[i])
        if(arr === i){
            sysout("no value found" -1)
        }
```

**Main code**

```java
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
```
