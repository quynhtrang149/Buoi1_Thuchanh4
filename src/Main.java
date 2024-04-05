import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " la nam nhuan");
                } else {
                    System.out.println(year + " khong phai nam nhuan");
                }
            } else {
                System.out.println(year + " la nam nhuan");
            }
        } else {
            System.out.println(year + " khong phai nam nhuan");
        }
    }
}