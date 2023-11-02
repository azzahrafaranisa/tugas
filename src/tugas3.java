import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir kamu (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Masukkan bulan lahir kamu (1-12): ");
        int month = scanner.nextInt();

        String zodiac = getZodiacSign(day, month);
        System.out.println("Zodiak kamu adalah: " + zodiac);

        scanner.close();
    }
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
        } else {
            return "Tidak ada zodiak yang cocok,coba lagi yaa";
        }
    }
}
