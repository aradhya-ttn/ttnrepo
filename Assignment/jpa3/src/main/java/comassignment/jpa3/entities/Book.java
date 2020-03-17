package comassignment.jpa3.entities;

import javax.persistence.*;

//5. Create an Entity book with an instance variable bookName.
@Entity
public class Book {
    @Id
    private  Integer bookId;
    private String bookName;

    @OneToOne
    @JoinColumn(name = "author_id")
    private  Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
