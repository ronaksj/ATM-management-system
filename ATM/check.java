public class check {
    static void checkbalance() {
        int b = ATM.display_balance();
        System.out.println("The available balance in your account is :" + b);
        System.out.println("-------------------------------------------");
        ATM.select_operation();
    }
}