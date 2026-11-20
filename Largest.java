import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();   
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        // int max = num1;
        // if(num2 > max) {
        //     max = num2;
        // }
        // if(num3 > max) {
        //     max = num3;
        // }

        int max = Math.max(num3,Math.max(num1,num2));
        System.out.println("The largest number is: " + max);
        sc.close();

    }
}