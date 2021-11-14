# Date: 21 / 9 / 2021

# Intro To Programming

## Types of Languages

- Procedural
- Functional
- Object Oriented

### Procedural

- specifies a series of well-structured steps and procedures to compose a program.
- contains a systematic order of statements order of statements, functions and commands to complete a task.

### Functional

- Writing a program only in pure functions ie never modify variables, but only create new ones as an output.
- used is situations where we have to perform lots of different operations on teh same set of data,
- First class functions

### Object oriented

- Revolves around object
- code + Data = Object
- Developed to make it easier to develop, debug reuse and maintain software.

## Static vs Dynamic Languages

### Static

- Perform type checking at compile time
- Error will show at compile time
- Declare datatype before you use it
- more control

### Dynamic Languages

- Perform type checking at runtime
- Error might not show till program is run
- No need to declare datatype of variable
- saves time in writing code but might give error ar runtime

## What is a Programming Language

machine or Computer only under stand <code>0, 1</code>, it will very Difficult to write an application in <code>0, 1</code>, it's very close to Impossible.

in oder to make this more human readable format more easy to write and Explain your point to the computer.

long story short - Explain you word or point to you computer we use programming Language.

## Java

so Java is one of those programming language,

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

so every java file has an extension <code>.java</code>

```java
filename.java
```

```java
Myfile.java
firstFile.java
```

## How Java Code executes

```java
.java file(human readable) --->compiler--->.class file(byte code)-->Machine Code(0, 1)
```

[Image](https://drive.google.com/file/d/1AtbTsPFw-NfEHKUvsq8U_tOiY6ULT-3O/view?usp=sharing)

### .java file(human readable)

- this is the source code

### .class file(byte code)

- this code will not directly run on a system
- we need JVM to run this
- Reason why java is platform independent

### machine code

- <code>0,1</code>

## write some code

when we write Java Code we need some boiler plate code

```java
public class filename{
    public static void main(String[] arr){
        // write your code here

    }
}
```

## Print Hello world

```java
public class filename{
    public static void main(String[] arr){
        // write your code here
System.out.println("hello world")
    }
}
```

in java we can print any thing using <code>System.out.println()</code>.

# Data types

Data Type - size -Description

byte 1 byte Stores whole numbers from -128 to 127

short 2 bytes Stores whole numbers from -32,768 to 32,767

int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647

long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits

boolean 1 bit Stores true or false values

char 2 bytes Stores a single character/letter or ASCII values

```java
   // in java we have 8 type of data type

   //byte - number -128 to 127
   byte num = 1;
   //short - number -32,768 to 32767
   short num2 = 100;
   //int - number  -2,147,483,648 to 2,147,483,647
   int num3 = 10000;
   //long - number -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
   long num4 = 10000000L;
   // float - decimal digits
   float num5 = 3.4F;
   //double = - long decimal digits
   double num6 = 33.444D;
   // boolean - true or false
   boolean isYes = true;
   // char - a single character
   char a = a;

```

# Variable

in java To create a variable, you must specify the type and assign it a value

```java
// syntax
type variable = value;
```

```java
int num = 100;
String name = "hari om";
```

# input (Scanner)

so use Scanner we can take input to user, like we have prompt in javascript and here Scanner

```java
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("sum of two number program");
        System.out.println("add num1");
        int num1 = in.nextInt();
        System.out.println("add num2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

```

## Condition (if/else)

as you know if this is true then do this else do this

```java
import java.util.Scanner;

public class ifElse {
public static void main(String[] args) {
    System.out.println("hello world");
    Scanner in = new Scanner(System.in);
    System.out.print("inter you age: ");
    int age = in.nextInt();
    if(age >= 18){
        System.out.println("your age is " + age + " you can vote");
    }else{
        System.out.println("you can't do vote");
    }
}
}
```
