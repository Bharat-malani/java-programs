import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        // int n = 43352;
        // int cnt = 0;
        // while (n > 0) {
        //     if(n % 10 == 3){
        //         cnt++;
        //     }
        //     n /= 10;
        // }
        // System.out.println("Count : "+ cnt);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Math.abs(sc.nextInt());

        System.out.print("Enter which number to count: ");
        int a = sc.nextInt();

        int cnt = 0;

        if (n == 0 && a == 0) {
            cnt = 1;
        } else {
            while (n > 0) {
                if (n % 10 == a) {
                    cnt++;
                }
                n /= 10;
            }
        }

        System.out.println("Count = " + cnt);
        sc.close();
    }
}
