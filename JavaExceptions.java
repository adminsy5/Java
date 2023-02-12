import java.io.PrintWriter;

public class JavaExceptions {
    void ArithmeticExceptionDemo() {
        int number = 10;
        try {
            // int output = number / 10; // it's gives you 1
            int output = number / 0;
            System.out.println("Number is : " + output);
        } catch (ArithmeticException ec) {
            // System.out.println(ec.getMessage().toString());
            System.out.println(ec);
        }
    }

    void NullPointerExceptionDemo() {
        try {
            String st = null;
            System.out.println(st.length());
        } catch (NullPointerException ec) {
            System.out.println(ec);
        }
    }

    void numberFormatExceptiondemo() {
        try {
            String st = "Hello";
            int test = Integer.parseInt(st);
            System.out.println(test);
        } catch (Exception ec) {
            System.out.println(ec);
        }
    }

    void ArayindexOutoffnboundDemo() {
        try {
            char[] ac = new char[20];
            ac[26] = 59;
            System.out.println("Good");
        } catch (Exception ec) {
            System.out.println(ec);
        }
    }

    void Exceptiontrycatch() {
        int num1 = 100;
        int num2 = 0;
        try {
            System.out.println("result=" + (num1 / num2));
        } catch (Exception ec) {
            System.out.println("ans= Oops You can't divide by " + num2);
        }
    }

    void ExceptionInexception() {
        try {
            int ij = 10000 / 0;
            System.out.println(ij);
        } catch (Exception ec) {
            // System.out.println(ec);
            int ij2 = 100 / 0;
            System.out.println(ij2);
        }
    }

    void fileNotfoundUsingPritWriterException() {
        PrintWriter pt;
        try {
            pt = new PrintWriter("X:\\rest.text");
            pt.println("hy");
        } catch (Exception ec) {
            System.out.println(ec);
        }
    }

    public static void main(String args[]) {
        JavaExceptions ExceptionHandling = new JavaExceptions();
        ExceptionHandling.ArithmeticExceptionDemo();
        ExceptionHandling.NullPointerExceptionDemo();
        ExceptionHandling.numberFormatExceptiondemo();
        ExceptionHandling.ArayindexOutoffnboundDemo();
        ExceptionHandling.Exceptiontrycatch();
        // ExceptionHandling.ExceptionInexception();
        ExceptionHandling.fileNotfoundUsingPritWriterException();
    }
}
