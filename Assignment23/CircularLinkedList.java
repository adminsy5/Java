import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    static Node last;

    public static void addToEmpty(int data) {
        if (last != null) {
            System.out.println("List is not empty");
            return;
        }
        Node temp = new Node(data);
        last = temp;
        last.next = last;
    }

    public static void addBegin(int data) {
        if (last == null) {
            addToEmpty(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
    }

    public static void addEnd(int data) {
        if (last == null) {
            addToEmpty(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        last = temp;
    }

    public static void traverse() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;
        while (temp != last) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add to empty list");
            System.out.println("2. Add at beginning");
            System.out.println("3. Add at end");
            System.out.println("4. Traverse");
            System.out.println("5. Quit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter integer element to insert : ");
                    int data = sc.nextInt();
                    addToEmpty(data);
                    break;
                case 2:
                    System.out.print("Enter integer element to insert : ");
                    data = sc.nextInt();
                    addBegin(data);
                    break;
                case 3:
                    System.out.print("Enter integer element to insert : ");
                    data = sc.nextInt();
                    addEnd(data);
                    break;
                case 4:
                    traverse();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println();
        }
    }
}