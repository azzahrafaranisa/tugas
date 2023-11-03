# Penjelasan Tugas

## Tugas 1
1. perulangan for yang menjelaskan menggunakan int dan variabel i adalah 1. Jika i kurang dari 100. maka variabel i ditambah.
 ```sh
   for (int i = 1; i <= 100; i++)
   ```
2. Jika variabel i kurang dari 9 maka akan memunculkan output angka yaitu 1, 2, 3, 4, 5, 6, 7, 8, 9.
```sh
   if (i <= 9) {
  System.out.println(i);
}
 ```

3. Jika lebih dari 9 maka akan muncul output Azzahra Faranisa sampai ke 100
```sh
   else {
                System.out.println("(Azzahra Faranisa)");
            }
   ```
4. Ini adalah hasil outputnya
![tugas 1](https://github.com/azzahrafaranisa/tugas/assets/146317281/ad83696e-3eea-4b05-9180-45e75d198e96)


## Tugas 2
1. Membaca input dari pengguna dan penamaan variabel yaitu number menggunakan type data integer
```sh
   Scanner scanner = new Scanner(System.in);
 int jumlah = scanner.nextInt();
   ```
2. Menampilkan ( Masukkan sejumlah bilangan: ) dan menginput variabel number sesuai dengan pengguna input
```sh
   System.out.print("Masukkan sejumlah bilangan: ");
int bilangan = 1;
        int ganjil = 0;
        int genap = 0;
   ```
3. Code ini meminta pengguna memasukkan bilangan genap atau ganjil, mencetak apakah bilangan tersebut bilangan genap atau ganjil, dan menampilkan jumlah bilangan yang terdiri dari ganjil atau genap dari angka yang di input sampai angka 1"
```sh
         while (bilangan <= jumlah) {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap");
                genap++;
            } else {
                System.out.println(bilangan + " adalah bilangan ganjil");
                ganjil++;
            }
            bilangan++;
        }

        System.out.println("Jumlah bilangan ganjil: " + ganjil);
        System.out.println("Jumlah bilangan genap: " + genap);

        scanner.close();
    }


penjelasan tambahan untuk if (bilangan % 2 == 0) {
Ini adalah pernyataan if yang digunakan untuk melakukan pengecekan kondisi. Ini memeriksa apakah bilangan adalah bilangan genap. Operasi % adalah operator modulus yang menghitung sisa pembagian bilangan dengan 2. Jika sisa pembagian adalah 0, maka bilangan adalah bilangan genap.

   ```
4. Ini adalah hasil outputnya
![tugas 2](https://github.com/azzahrafaranisa/tugas/assets/146317281/3c127497-90a7-44f6-9277-2dcb95db221f)


## Tugas 3
1. Kode ini adalah bagian dari program yang digunakan untuk mengambil input tanggal lahir dan bulan lahir dari pengguna, kemudian menghitung zodiak berdasarkan input tersebut. dengan memasukkan tanggal lahir dari rentang 1-31 dan bulan rentang 1-12
```sh
        System.out.print("Masukkan tanggal lahir kamu (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Masukkan bulan lahir kamu (1-12): ");
        int month = scanner.nextInt();
```

   2.     String zodiac = getZodiacSign(day, month);: Baris ini memanggil metode getZodiacSign dengan dua argumen, yaitu day dan month. Variabel day dan month adalah tanggal dan bulan lahir yang telah dimasukkan oleh pengguna. Metode getZodiacSign akan mengembalikan sebuah string yang berisi nama zodiak yang sesuai berdasarkan tanggal dan bulan yang diberikan. Hasil ini disimpan dalam variabel zodiac.System.out.println("Zodiak kamu adalah: " + zodiac);: Baris ini mencetak hasil perhitungan zodiak ke layar. Pesan "Zodiak kamu adalah: " diikuti oleh nilai yang disimpan dalam variabel zodiac dicetak. Dengan cara ini, pengguna akan melihat nama zodiak mereka sebagai keluaran program.
```sh
         String zodiac = getZodiacSign(day, month);
        System.out.println("Zodiak kamu adalah: " + zodiac);
   ```
3. Metode ini mengambil dua argumen: day yang merupakan tanggal, dan month yang merupakan bulan. Metode ini akan mengembalikan string yang berisi nama zodiak yang sesuai.Selanjutnya, terdapat serangkaian pernyataan if dan else if yang memeriksa kombinasi bulan dan tanggal untuk menentukan zodiak yang sesuai. Misalnya, blok pertama memeriksa apakah tanggal berada di antara tanggal 21 dan 31 untuk bulan Maret (3) atau tanggal kurang dari atau sama dengan 19 untuk bulan April (4). Jika kondisi ini terpenuhi, maka metode akan mengembalikan string "Aries" yang merupakan zodiak yang sesuai.Setiap blok if dan else if berikutnya melakukan pemeriksaan serupa untuk zodiak-zodiak lainnya seperti Taurus, Gemini, Cancer, dan seterusnya.
```sh
   public static String getZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day <= 20)) {
            return "Pisces";
   ```
3.Jika tidak ada kondisi yang terpenuhi di seluruh blok if dan else if, maka pernyataan else terakhir akan dijalankan, yang akan mengembalikan pesan "Tidak ada zodiak yang cocok, coba lagi yaa."
```sh
  } else {
            return "Tidak ada zodiak yang cocok,coba lagi yaa";
        }
   ```
4. Ini adalah hasil outputnya
![tugas 3](https://github.com/azzahrafaranisa/tugas/assets/146317281/54636b76-597f-46e8-a5b3-adb508093be5)


## Tugas 4
1. Kode tersebut membuat sebuah array numbers yang berisi bilangan bulat dari 1 hingga 20. Selanjutnya, menggunakan sebuah loop for, program mencetak nilai-nilai dalam array tersebut satu per satu ke layar. Hasilnya adalah mencetak bilangan 1 hingga 10 ke layar.
```sh
     int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Nilai dalam variabel array:");
      for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
   ```
2. ini adalah hasil outputnya
![tugas 4](https://github.com/azzahrafaranisa/tugas/assets/146317281/b7844e42-ff55-47a8-a982-a6f065e8b161)

