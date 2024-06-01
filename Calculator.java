import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //for taking input//
        Scanner scanner = new Scanner(System.in);
        //taking first input//
        System.out.println("enter a number");
        int a = scanner.nextInt();
        //taking second input//
        System.out.println("enter a number");
        int b = scanner.nextInt();
        //taking operators//
        System.out.println("enter operation to be done (+,*,/,-");
        char operator = scanner.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                 result = a + b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;

                default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        System.out.println("result:" +result);

    }
}