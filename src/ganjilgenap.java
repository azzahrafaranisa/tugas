import java.util.Scanner;
public class ganjilgenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sejumlah bilangan: ");
        int jumlah = scanner.nextInt();

        int bilangan = 1;
        int ganjil = 0;
        int genap = 0;

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



}
