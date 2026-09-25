public class BankDemo {
    public static void main(String[] args) {

        // Membuat beberapa bank
        Bank bca = new Bank("BCA");
        Bank mandiri = new Bank("Mandiri");
        Bank bni = new Bank("BNI");

        // Membuat user
        User dani = new User("Dani");
        User jaki = new User("Jaki");
        User akbar = new User("Akbar");
        User ikky = new User("Ikky");


        // Rekening BCA
        Account bca1 = new Account("1234567890", bca, 1000000);
        Account bca2 = new Account("9876543210", bca, 500000);
        Account bca3 = new Account("0876543210", bca, 0);

        
        // Rekening Mandiri
        Account mandiri1 = new Account( "1112223334", mandiri, 2000000);

        // Rekening BNI
        Account bni1 = new Account("5556667778", bni, 750000);

        // Masukkan semua rekening ke User
        dani.tambahAccount(bca1);
        dani.tambahAccount(bca2);
        jaki.tambahAccount(bca3);
        ikky.tambahAccount(mandiri1);
        akbar.tambahAccount(bni1);

        // Tampilkan semua rekening
        dani.tampilkanAccounts();
        jaki.tampilkanAccounts();

        // Contoh transaksi
        bca1.deposit(500000);

        mandiri1.withdraw(300000);

        bca1.transfer(200000, bca3);
        jaki.tampilkanAccounts();
    }
}