import java.util.Scanner;
public class fibonanci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        System.out.print(a + " ");
        for(int i = 2; i<=n; i++){
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;
            
        }

        // int cnt = 2;
        // while (cnt <= n) {
        //     int temp = b;
        //     b = a + b;
        //     a = temp;
        //     cnt++;
        // }
        // System.out.println(b);
        sc.close();
        
    }
}
