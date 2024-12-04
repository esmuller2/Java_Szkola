import java.util.Scanner;

public class Main {

    public static String encrypt(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) ((ch - 'a' + shift) % 26 + 'a');
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String input, int shift) {
        StringBuilder decrypted = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int shift = 0;
            boolean validShift = false;

            while (!validShift) {
                try {
                    System.out.print("Wprowadź przesunięcie (liczba od 1 do 25): ");
                    shift = Integer.parseInt(scanner.nextLine());

                    if (shift < 1 || shift > 25) {
                        System.out.println("Błąd: przesunięcie musi być liczbą od 1 do 25.");
                    } else {
                        validShift = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Błąd: wprowadź liczbę.");
                }
            }

            System.out.print("Wprowadź zdanie do zaszyfrowania: ");
            String input = scanner.nextLine();

            String encrypted = encrypt(input, shift);
            System.out.println("Zaszyfrowane zdanie: " + encrypted);

            String decrypted = decrypt(encrypted, shift);
            System.out.println("Odszyfrowane zdanie: " + decrypted);

            System.out.print("Czy chcesz zaszyfrować kolejne zdanie? (tak/nie): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("tak")) {
                System.out.println("Dziękuję za użycie programu!");
                break;
            }
        }

        scanner.close();
    }
}
