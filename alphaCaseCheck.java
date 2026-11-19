import java.util.Scanner;
public class alphaCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);
        if(ch >='a' && ch <='z') {
            System.out.println("Lowercase");
        } else if(ch >='A' && ch <='Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Invalid input");
        }
    }
}
