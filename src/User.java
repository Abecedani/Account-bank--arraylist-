import java.util.ArrayList;

public class User {
    private String nama;
    private ArrayList<Account> accounts;

    // Constructor
    public User(String nama) {
        this.nama = nama;
        accounts = new ArrayList<>();
    }

    // Menambahkan rekening
    public void tambahAccount(Account account) {
        accounts.add(account);
    }

    // Menampilkan semua rekening
    public void tampilkanAccounts() {
        System.out.println("===== REKENING " + nama + " =====");

        for (Account account : accounts) {
            System.out.println(
                "Bank       : " + account.getBank().getNamaBank()
            );

            System.out.println(
                "No Rekening: " + account.getNomorRekening()
            );

            System.out.println(
                "Saldo      : Rp " + account.getBalance()
            );

            System.out.println();
        }
    }

    // Getter
    public String getNama() {
        return nama;
    }
}