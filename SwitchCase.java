import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String a = "Kunal";
        // String b = "kunal";
        // System.out.println(a == b);
        System.out.print("Enter a fruit name : ");
        String fruit = sc.next();
        switch(fruit) {
            case "mango":
                System.out.println("King of fruits Mango");
                break;
            case "apple":
                System.out.println("A sweet red fruit apple");
                break;
            case "orange":
                System.out.println("Round fruit orange");
                break;
            case "grapes":
                System.out.println("Small fruit Grapes");
                break;
            default:
                System.out.println("Please enter a valid fruit!");
                break;
        }
        

        sc.close();
    }
}
