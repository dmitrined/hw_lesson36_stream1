import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Илон", "Маск", "musk@mail.com");
        Person p2 = new Person("Анджелина", "Джоли", "jolie@mail.com");
        Person p3 = new Person("Лионель", "Месси", "messi@mail.com");
        Person p4 = new Person("Тейлор", "Свифт", "swift@mail.com");
        Person p5 = new Person("Джеки", "Чан", "chan@mail.com");
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount(p1, "DE12345678", 87.5));
        bankAccounts.add(new BankAccount(p2, "DE98765432", 125903.21));
        bankAccounts.add(new BankAccount(p3, "DE11223344", 876543.99));
        bankAccounts.add(new BankAccount(p4, "DE55667788", 2109876.45));
        bankAccounts.add(new BankAccount(p5, "DE99001122", 58.96));


        System.out.println("List всех аккаунтов, баланс которых составляет менее 100");
        List<BankAccount> littleBalance = bankAccounts.stream()
                .filter(bA -> bA.getBalance() < 100)
                .toList();
        System.out.println(littleBalance);

        System.out.println("\nList всех владельцев счетов");
        List<Person> accountOwners = bankAccounts.stream()
                .map(bA -> bA.getOwner())
                .toList();
        System.out.println(accountOwners);

        System.out.println("\nList вида(ФИ; счет, email)  чей баланс более 100000");
        List<String> bigBalance = bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getBalance() > 100000)
                .map(bA -> String.format("%s %s;IBAN: %s;%s",
                        bA.getOwner().getfName(),
                        bA.getOwner().getlName().substring(0, 1).toUpperCase(),
                        bA.getIBAN(),
                        bA.getOwner().getEmail()))
                .toList();
        System.out.println(bigBalance);


    }
}