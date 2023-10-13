package src;

public class AccountBank {
    private String name;
    private String email;
    private String phone;
    private int money;

    public AccountBank(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.money = 0;
    }

    public String getInfo(){
        return "Account Information: Name " + this.name + " Email " + this.email + " Phone " + this.phone;
    }

    public String deposit(int number) {
        this.money += number;
        return "Deposit account successfully";
    }

    public String withdraw(int number) {
        if (this.getMoney() >= number) {
            this.money -= number;
            return "Withdraw money successfully";
        }
        return "Money in account not enough";
    }

    public int getMoney() {
        return this.money;
    }
}
