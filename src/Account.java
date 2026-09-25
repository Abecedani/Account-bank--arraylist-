public class Account {
    private String nomorRekening;
    private int saldo;
    private Bank bank;

    // Constructor
    public Account(String nomorRekening, Bank bank, int saldo) {
        this.nomorRekening = nomorRekening;
        this.bank = bank;
        this.saldo = saldo;
    }

    // Deposit
    public void deposit(int jumlah) {
        saldo += jumlah;

        System.out.println("Setor: Rp " + jumlah);
        System.out.println("Saldo sekarang: Rp " + saldo);
    }

    // Withdraw
    public void withdraw(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;

            System.out.println("Tarik: Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    // Transfer
    public void transfer(int jumlah, Account rekeningTujuan) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            rekeningTujuan.deposit(jumlah);

            System.out.println("Transfer: Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Saldo tidak cukup untuk transfer!");
        }
    }

    // Getter
    public int getBalance() {
        return saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public Bank getBank() {
        return bank;
    }
}