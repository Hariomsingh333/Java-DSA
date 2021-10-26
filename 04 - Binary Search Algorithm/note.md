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
