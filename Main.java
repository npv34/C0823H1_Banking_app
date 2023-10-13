import src.AccountBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountBank account = new AccountBank("Kien", "kien@gmail.com", "00909009");
        Scanner scanner = new Scanner(System.in);

        boolean exitSystem = true;

        while (exitSystem) {
            System.out.println("------Chose menu --------");
            System.out.println("1: Deposit to account");
            System.out.println("2: Withdraw from account");
            System.out.println("3: View money from bank");
            System.out.println("0: Exit");

            int choseNumber = scanner.nextInt();
            switch (choseNumber) {
                case 1:
                    System.out.println("Enter the money to deposit: ");
                    int amount = scanner.nextInt();
                    System.out.println(account.deposit(amount));
                    break;
                case 2:
                    System.out.println("Enter the money to withdraw: ");
                    int number = scanner.nextInt();
                    System.out.println(account.withdraw(number));
                    break;
                case 3:
                    int currencyMoney = account.getMoney();
                    System.out.println("Currency money of account: " + currencyMoney);
                    break;
                default:
                    exitSystem = false;
            }
        }




    }
}
