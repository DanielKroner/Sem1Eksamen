package TaskThree;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> bookList;
    public User currentUser;


    public Library(User user) {
        this.currentUser = user;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void borrowBook(Book book) {
        currentUser.borrowBook(book);
    }

    public void returnBook(Book book) {
        currentUser.returnBook(book);
    }

    public void displayBooks(){
        System.out.println("The books in the library are: ");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
