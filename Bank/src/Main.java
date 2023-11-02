public class Main {
    public static void main(String[] args) {
        Account Person01 = new Account();
        Person01.setAccouNum(999);
        Person01.setClient("Hoppenheimer");
        Person01.openAccount("CC");

        Account Person02 = new Account();
        Person02.setAccouNum(132498);
        Person02.setClient("Eistein");
        Person02.openAccount("CP");

        Person01.deposit(100);
        Person02.deposit(500);
        Person02.booty(100);

        Person01.booty(150);
        Person01.closeAccount();

        Person01.actualState();
        Person02.actualState();

    }
}