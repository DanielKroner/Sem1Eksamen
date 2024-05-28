package TaskThree;

import java.util.List;

public class User {

    public String name;
    public int userNumber;
    List<Book> borrowedBooks;


    public User(String name, int userNumber, List<Book> borrowedBooks) {
        this.name = name;
        this.userNumber = userNumber;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
        System.out.println(book.getTitle() + " has been added to the borrowed list.");
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowed(false);
        System.out.println(book.getTitle() + " has been removed from the borrowed list.");
    }


    public String getName() {
        return name;
    }
    public int getUserNumber() {
        return userNumber;
    }
    public void getBorrowedBooks() {
        System.out.println(getName() + "'s borrowed books are: ");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Number: " + getUserNumber() + ", Name: " + getName();
    }

}
