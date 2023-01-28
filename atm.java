import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int f, bill = 1000000;
        List<Integer> h = new ArrayList<>();
        while (true) {

            System.out.println("1.withdraw");
            System.out.println("2.deposit");
            System.out.println("3.transfer");
            System.out.println("4.balance check");
            System.out.println("Enter the choice");
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("amount to withdrow");
                i = scanner.nextInt();
                bill -= i;
                System.out.println(bill);

            } else if (i == 2) {
                System.out.println("amount to deposit");
                i = scanner.nextInt();
                bill += i;
                System.out.println(bill);
            } else if (i == 3) {
                System.out.println("amount to transver ");
                i = scanner.nextInt();
                bill -= i;
                System.out.println("account number ");
                i = scanner.nextInt();
                System.out.println(bill);
            } else if (i == 4) {
                System.out.println("balance");
                System.out.println(bill);
            } else {
                break;
            }
        }

        System.out.println("balannce" + bill);

    }
}
