import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */
public class Book {

    private String title;
    private String author;
    private Date dueDate;
    private Boolean braille;
    private Status status;
    private Genre genre;

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

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getBraille() {
        return braille;
    }

    public void setBraille(Boolean braille) {
        this.braille = braille;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}