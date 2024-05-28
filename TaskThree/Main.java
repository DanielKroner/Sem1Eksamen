package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user = new User("Daniel", 123, new ArrayList<>());
        Library library = new Library(user);


        Book book1 = new Book("Muldvarpen, der ville vide, hvem der havde lavet lort på dens hoved", "Wolf Erlbruch");
        library.addBook(book1);
        Book book2 = new Book("Kaptajn Underhyler", "Dav Pilkey");
        library.addBook(book2);
        Book book3 = new Book("Bogen der hellere ville være en badevægt", "Martin Sommer");
        library.addBook(book3);
        Book book4 = new Book("Hvem har pruttet i Lasse-Leifs bukser?", "Mette Finderup");
        library.addBook(book4);
        Book book5 = new Book("Skrækkelige Rikke og den ildelugtende finger", "Jaap Robben");
        library.addBook(book5);

        System.out.println("-------------");
        library.displayBooks();
        System.out.println("-------------");

        library.borrowBook(book5);
        System.out.println("-------------");

        user.getBorrowedBooks();
        System.out.println("-------------");

        library.returnBook(book5);
        System.out.println("-------------");

        user.getBorrowedBooks();

    }
}
