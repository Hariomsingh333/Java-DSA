# Date: 25 / 9 / 2021

# Java Fundamentals 2

## Loops

### What is a loop

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.

long story short a loop is a program that run again and again until the task in true.

in Java we have tree type of loop

- for loop
- while loop
- do while loop

## for loop

### for loop syntax

```java
// for loop
// syntax
/* for (initialization condition; testing condition; increment/decrement){
    // statement(s)
} */

```

```java
  // Q: print number 1 to 10;
  for (int i = 1; i<=10; i++){
      System.out.println(i);
  }

```

what happing in for loop

- first we create a variable i or j and set it to some data 0, 1
- after the variable checking for condition
- if the condition in false then print the statement and i++ mean increment
- once the condition in true we exit

## while loop

while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition

- if the condition is true then the statement will be run and num++
- when the condition is false then the loop break

```java
  // Q: print number 1 to 10 using while loop
  int num = 0;
  while(num <= 10){
      System.out.println(num);
      num++;
  }

```

# function

A function is a block of code which only runs when it is called.

You can pass data, known as parameters, into a function.

Methods are used to perform certain actions, and they are also known as functions.

```java
// syntax
public static void funName(){
  // code to be executed
}
```

- function always define under <code>public class</code> not under the main function
- never define a function under another function.

### void

void mean nothing null. if you function return nothing then we use void

```java
public static void sayName(String name){
  System.out.print("Hello " + name)
  // return;   return //0
}
```

- if you return String then use String rather than void

```java
String yourName = "";
public static String sayName(String name){
  return yourName = "hi" + name;
}
```

- if you need to return int then use int

```java
public static int add (int num1, int num2){
  return num1 + num2;
}
```

```java
 public static int add(int num1, int num2){
     int sum = num1+num2;
     System.out.println(sum);
    return 0;
 }

```

# Array

An array in Java is a set of variables referenced by using a single variable name combined with an index number. Each item of an array is an element. All the elements in an array must be of the same type. ... An int array can contain int values, for example, and a String array can contain strings.

```java
// syntax

type var-name[];
OR
type[] var-name;

type var-name [] = new type [size];

int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
//or
int arr[] = new int [3];
arr[0]= 99;
arr[1] = 34;
arr[2] = 45;
```

```java
int [] arr = new int[3];
arr[0] = 34;
arr[1] = 54;
arr[2] = 78;
```

### Accessing Java Array Elements using for Loop

```java

  for (int i = 0; i < arr.length; i++) {
     System.out.println("element of index " + i + ": " + arr[i]);
  }

```

### Array Literal

we can also define array using array literal, array literal is the easy way to define array in java

```java
// array literal

// this is easy way to define array
  int arr [] = {44,55,62,89,76,9};
```

## 2D Array

2D array like matrix.
2d Array is very helpful for complex problem so this is important
rows = 3 || columns = 5 (3x5)

### 2d Array Syntax

```java
type [][] arrayName = new type[rows][columns];

// like this
int [][]numbers = new int[3][5]

```
