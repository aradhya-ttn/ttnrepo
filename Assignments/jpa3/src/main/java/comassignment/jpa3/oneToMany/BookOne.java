package comassignment.jpa3.oneToMany;

import comassignment.jpa3.entities.Author;

import javax.persistence.*;

@Entity
public class BookOne {
    @Id
    private  Integer bookId;
    private String bookName;

    @ManyToOne
    @JoinColumn(name = "authorOne_id")
    private  AuthorOne authorOne;

    public AuthorOne getAuthorOne() {
        return authorOne;
    }

    public void setAuthorOne(AuthorOne authorOne) {
        this.authorOne = authorOne;
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
