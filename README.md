## Library Tambahan

Program ini menggunakan library tambahan dari Java, yaitu:

### `java.util.ArrayList`

`ArrayList` digunakan untuk menyimpan banyak objek `Account` yang dimiliki oleh seorang `User`.

Import yang digunakan:

```java
import java.util.ArrayList;
```

Berbeda dengan array biasa (`Account[]`), `ArrayList` memiliki ukuran yang dapat bertambah secara dinamis. Jadi, jumlah rekening yang dimiliki oleh user tidak harus ditentukan sejak awal.

Contohnya:

```java
private ArrayList<Account> accounts;
```

Kemudian `ArrayList` dibuat pada constructor:

```java
accounts = new ArrayList<>();
```

Untuk menambahkan rekening:

```java
accounts.add(account);
```

Untuk mengakses rekening berdasarkan index:

```java
accounts.get(0);
```

Untuk mengetahui jumlah rekening:

```java
accounts.size();
```

### Alasan Menggunakan `ArrayList`

`ArrayList` digunakan karena satu `User` dapat memiliki lebih dari satu rekening. Dengan `ArrayList`, rekening dapat ditambahkan secara dinamis tanpa harus menentukan jumlah rekening terlebih dahulu.

Struktur hubungan objek dalam program:

```text
User Dani
│
├── Account BCA
│   └── Bank BCA
│
├── Account BCA Tabungan
│   └── Bank BCA
│
├── Account Mandiri
│   └── Bank Mandiri
│
└── Account BNI
    └── Bank BNI
```

Dalam struktur tersebut:

* `User` dapat memiliki banyak `Account`.
* Setiap `Account` memiliki satu `Bank`.
* Satu `Bank` dapat digunakan oleh beberapa `Account`.
* `ArrayList<Account>` digunakan pada `User` untuk menyimpan seluruh rekening yang dimiliki user.

### Contoh Penggunaan

```java
User dani = new User("Dani");

Account bca = new Account("001", 1000000, new Bank("BCA"));
Account bcaTabungan = new Account("002", 2000000, new Bank("BCA"));
Account mandiri = new Account("003", 1500000, new Bank("Mandiri"));

dani.tambahAccount(bca);
dani.tambahAccount(bcaTabungan);
dani.tambahAccount(mandiri);
```

Dengan menggunakan `ArrayList`, objek `Account` dapat ditambahkan ke dalam `User` menggunakan method `add()` tanpa menentukan batas jumlah rekening di awal.
