package comassignment.jpa3.manyToMany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookMany {
    @Id
    private  Integer bookid;
    private String bookName;

    @ManyToMany(mappedBy ="booksmany")
    Set<AuthorMany> authorManySet;

    public Set<AuthorMany> getAuthorManySet() {
        return authorManySet;
    }

    public void setAuthorManySet(Set<AuthorMany> authorManySet) {
        this.authorManySet = authorManySet;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
