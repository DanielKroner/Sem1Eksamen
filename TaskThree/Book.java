package TaskThree;

public class Book {

    public String title;
    public String author;
    public boolean isBorrowed;


    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public Book setBorrowed(boolean borrowed){
        this.isBorrowed = borrowed;
        return this;
    }

    @Override
    public String toString(){
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nAvailable: " + (isBorrowed? "No :(" : "Yes :)" + "\n");
    }
}
