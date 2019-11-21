public class Main {
    public static void main(String[] args) {
        Account emiliosAccount = new Account("Emilio");
        emiliosAccount.deposit(1_000_000);
        emiliosAccount.withdraw(500_000);
        emiliosAccount.deposit(1_000_000);
        emiliosAccount.calculateBalance();

        System.out.println("Balance on account is " + emiliosAccount.getBalance());

    }
}
