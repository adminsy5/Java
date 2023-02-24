package package2;

public class pack_class2 {
    public void mymethod2(int no) {
        int r, sum = 0, temp;
        int n = no;

        while (n > 0) {
            r = n % 10;
            temp = r * r * r;
            sum = sum + temp;
            n = n / 10;
        }
        if (no == sum)
            System.out.println("This Number is Armstrong");
        else
            System.out.println("This Number is Not Armstrong");
    }
}