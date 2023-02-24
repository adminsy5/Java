import java.util.Scanner;

public class Student {
    String roll_no;
    String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[5];
        for (int i = 0; i < 5; i++) {
            stud[i] = new Student();
            System.out.print("Enter Student " + (i + 1) + " Roll No: ");
            stud[i].roll_no = sc.next();
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            stud[i].name = sc.next();
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (stud[j].name.compareTo(stud[j + 1].name) > 0) {
                    Student temp = stud[j];
                    stud[j] = stud[j + 1];
                    stud[j + 1] = temp;
                }
            }
        }
        System.out.println("Student Data in Ascending Order of Name with Interval of 1 Second: ");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Roll No:  " + stud[i].roll_no + "|| Name: " + stud[i].name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}