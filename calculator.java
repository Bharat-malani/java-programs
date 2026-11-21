import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter a operator : ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first no: ");
                int a = sc.nextInt();
                System.out.print("Enter second no: ");
                int b = sc.nextInt();

                if (op == '+') {
                    ans = a + b;
                } else if (op == '-') {
                    ans = a - b;
                } else if (op == '*') {
                    ans = a * b;
                } else if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                } else if (op == '%') {
                    ans = a % b;
                }

            } 
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operator!!");
            }
            System.out.println("Ans = " + ans);
        }
        sc.close();
    }
}