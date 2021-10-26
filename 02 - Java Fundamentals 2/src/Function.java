import java.util.Scanner;

public class Function {
   public static void main(String[] args) {
      // function in java
    //   System.out.print("enter you name: ");
      Scanner in = new Scanner(System.in);

    //  String name = in.next();
    //  sayHI(name);

    int num1 = in.nextInt();
    int num2 = in.nextInt();
    add(num1, num2);
} 

// using void in funtion
    //   public static void sayHI(String name){
    //         System.out.print("hi " + name);
    //   } 

    // using int in function
    public static int add(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
       return 0; 
    }
}
