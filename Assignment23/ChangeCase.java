import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();
        System.out.println("Choose an option:\n1. UPPERCASE\n2. LOWERCASE\n3. SENTENCE CASE\n4. TOGGLE CASE\n");
        int option = scanner.nextInt();
        scanner.close();
        switch (option) {
            case 1:
                System.out.println(inputString.toUpperCase());
                break;
            case 2:
                System.out.println(inputString.toLowerCase());
                break;
            case 3:
                System.out.println(inputString.substring(0, 1).toUpperCase() +
                        inputString.substring(1).toLowerCase());
                break;
            case 4:
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < inputString.length(); i++) {
                    char currentChar = inputString.charAt(i);
                    if (Character.isUpperCase(currentChar)) {
                        result.append(Character.toLowerCase(currentChar));
                    } else {
                        result.append(Character.toUpperCase(currentChar));
                    }
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
