
import java.util.Random;

public class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Вклад: " + amount + " | Текущий баланс: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие: " + amount + " | Текущий баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств! ");
        }
    }

    public static void main(String[] args) {
        Bank account = new Bank(100);

        Runnable depositTask = () -> {
            Random random = new Random();
            int amount = random.nextInt(50) + 1;
            account.deposit(amount);
        };

        Runnable withdrawTask = () -> {
            Random random = new Random();
            int amount = random.nextInt(50) + 1;
            account.withdraw(amount);
        };

        for (int i = 0; i < 10; i++) {
            new Thread(depositTask).start();
            new Thread(withdrawTask).start();
        }
    }
}