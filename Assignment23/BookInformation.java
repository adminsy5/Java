import java.util.*;

class Book {
    String title;
    String author;
    String publication;
    float price;

    public Book(String t, String a, String p, float f) {
        title = t;
        author = a;
        publication = p;
        price = f;
    }
}

class BookDisplayThread extends Thread {
    Book books[];

    BookDisplayThread(Book books[]) {
        this.books = books;
    }

    public void run() {
        System.out.println("Books in Descending Order of Price:");
        for (int i = 0; i < books.length; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Title: " + books[i].title + "\nAuthor: " +
                    books[i].author + "\nPublication: " + books[i].publication +
                    "\nPrice: " + books[i].price + "\n");
        }
    }
}

public class BookInformation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        Book books[] = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for book " + (i + 1) +
                    ":");
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Author: ");
            String author = sc.next();
            System.out.print("Publication: ");
            String publication = sc.next();
            System.out.print("Price: ");
            float price = sc.nextFloat();
            books[i] = new Book(title, author, publication, price);
        }
        /* Arrays.sort(books, (a, b) ->Float.compare(b.price, a.price)); */
        BookDisplayThread thread = new BookDisplayThread(books);
        thread.start();
    }
}