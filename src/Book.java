import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */
public class Book {

    private String title;
    private String author;
    private String dueDate;
    private String braille;
    private String status;
    private String genre;

    public Book(String title, String author, String dueDate, String braille, String status, String genre) {
        this.title = title;
        this.author = author;
        this.dueDate = dueDate;
        this.braille = braille;
        this.status = status;
        this.genre = genre;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBraille() {
        return braille;
    }

    public void setBraille(String braille) {
        this.braille = braille;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + "   Author: " + author + "   Due Date: " + dueDate;

    }
}