    import java.util.*;

    public class PasswordGenerator {
        private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
        private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String DIGITS = "0123456789";
        private static final String SYMBOLS = "!@#$%^&*()_+";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Password Generator. Let's see what you have got!");

            System.out.print("Enter desired password length: ");
            int length = scanner.nextInt();

            System.out.print("Include uppercase letters? (true/false): ");
            boolean includeUpper = scanner.nextBoolean();

            System.out.print("Include numbers? (true/false): ");
            boolean includeNumbers = scanner.nextBoolean();

            System.out.print("Include symbols? (true/false): ");
            boolean includeSymbols = scanner.nextBoolean();

            System.out.println("Generated Password: " + generatePassword(length, includeUpper, includeNumbers, includeSymbols));
            scanner.close();
        }

        public static String generatePassword(int length, boolean includeUpper, boolean includeNumbers, boolean includeSymbols) {
            String charPool = LOWER;
            if (includeUpper) {
                charPool += UPPER;
            }
            if (includeNumbers) {
                charPool += DIGITS;
            }
            if (includeSymbols) {
                charPool += SYMBOLS;
            }

            Random random = new Random();
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(charPool.length());
                password.append(charPool.charAt(index));
            }

            return password.toString();
        }
    }


