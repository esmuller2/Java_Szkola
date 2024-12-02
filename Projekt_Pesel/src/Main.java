import java.util.Scanner;

public class Main {
    public static boolean isValidPESEL(String pesel) {
        if (pesel.length() != 11 || !pesel.matches("\\d{11}")) {
            return false;
        }

        int[] weights = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};
        int checksum = 0;

        for (int i = 0; i < 10; i++) {
            checksum += Character.getNumericValue(pesel.charAt(i)) * weights[i];
        }

        int controlDigit = Character.getNumericValue(pesel.charAt(10));
        return checksum % 10 == controlDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer PESEL: ");
        String pesel = scanner.nextLine();

        if (isValidPESEL(pesel)) {
            System.out.println("Numer PESEL jest poprawny.");
        } else {
            System.out.println("Numer PESEL jest niepoprawny.");
        }
    }
}
