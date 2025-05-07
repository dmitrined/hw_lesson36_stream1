public class BankAccount {
    private Person owner;
    private String IBAN;
    private double balance;

    public BankAccount(Person owner, String IBAN, double balance) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("owner=").append(owner);
        sb.append(", IBAN='").append(IBAN).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
