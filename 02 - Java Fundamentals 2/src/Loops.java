import java.util.Scanner;

public class Loops{
    public static void main(String[] args) {
        // loops
        // for loop
        // syntax
        /* for (initialization condition; testing condition; increment/decrement){
            // statement(s)
        } */
        
        // Q: print number 1 to 10;
        // for (int i = 1; i<=10; i++){
        //     System.out.println(i);
        // }
        // Q: print number 1 to 10 using while loop
        // int num = 0;
        // while(num <= 10){
        //     System.out.println(num);
        //     num++;
        // }

        // Q: make a calculator using while loop
        int ans = 0;
        while(true){
        Scanner in = new Scanner(System.in);
        System.out.print("enter you first num: ");
        int num1 = in.nextInt();
        System.out.print("enter you second num: ");
        int num2 = in.nextInt();
        System.out.print("enter you operator: ");
        char opera = in.next().trim().charAt(0);

            if(opera == '+'){
                ans = num1 + num2;
            }else if(opera == '-'){
                ans = num1 - num2;
            }else if(opera == '*'){
                ans = num1 * num2;
            }else if (opera == '/'){
                ans = num2 /num1;
            }else if (opera == 'x'){
                break;
            }
            System.out.println(ans);
        }
    }
}