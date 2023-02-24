package package1;

public class pack_class1 {
    public void mymethod1(int no) {
        // System.out.println("Hello I am Package1");
        int r, sum = 0, temp;
        int n = no; // It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("This Number is palindrome");
        else
            System.out.println("This Number is not palindrome");
    }
}