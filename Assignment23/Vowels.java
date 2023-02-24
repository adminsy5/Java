import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the option:");
        System.out.println("1. Extract vowels.");
        System.out.println("2. Extract consonants.");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                extractVowels(str);
                break;
            case 2:
                extractConsonants(str);
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    public static void extractVowels(String str) {
        System.out.println("Enter the output option:");
        System.out.println("1. Uppercase");
        System.out.println("2. Lowercase");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        String vowels = "";
        switch (option) {
            case 1:
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                            str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E'
                            ||
                            str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                        vowels = vowels + str.charAt(i);
                    }
                }
                System.out.println("The extracted vowels in uppercase are: " + vowels.toUpperCase());
                break;
            case 2:
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                            str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E'
                            ||
                            str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                        vowels = vowels + str.charAt(i);
                    }
                }
                System.out.println("The extracted vowels in lowercase are: " + vowels.toLowerCase());
                break;
            default:
                System.out.println("Invalid option!");
        }

    }

    public static void extractConsonants(String str) {
        System.out.println("Enter the output option:");
        System.out.println("1. Uppercase");
        System.out.println("2. Lowercase");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        String consonants = "";
        switch (option) {
            case 1:
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' &&
                            str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E'
                            &&
                            str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U'
                            && str.charAt(i) != ' ') {
                        consonants = consonants + str.charAt(i);
                    }
                }
                System.out.println("The extracted consonants in uppercase are: " + consonants.toUpperCase());
                break;
            case 2:
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' &&
                            str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E'
                            &&
                            str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U'
                            && str.charAt(i) != ' ') {
                        consonants = consonants + str.charAt(i);
                    }
                }
                System.out.println("The extracted consonants in lowercase are: " + consonants.toLowerCase());
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
}