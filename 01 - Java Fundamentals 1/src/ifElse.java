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
