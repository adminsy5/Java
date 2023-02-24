import package1.*;
import package2.*;
import java.util.*;

public class PackageJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        pack_class1 pc1 = new pack_class1();
        pack_class2 pc2 = new pack_class2();
        System.out.print("Please Enter number for check palimdrome : ");
        int a = sc.nextInt();
        pc1.mymethod1(a);
        System.out.print("Please Enter number for check Armstrong : ");
        int b = sc.nextInt();
        pc2.mymethod2(b);
    }
}