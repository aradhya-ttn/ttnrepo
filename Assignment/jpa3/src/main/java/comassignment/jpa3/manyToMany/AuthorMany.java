package comassignment.jpa3.manyToMany;


import javax.persistence.*;
import java.util.List;

@Entity
public class AuthorMany {
    @Id
    private Integer id;
    private  String name;
    private Integer age;

    @Embedded
    AuthorAddressMany authorAddressesMany;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authors_books",joinColumns=@JoinColumn( name = "author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "books_id",referencedColumnName = "bookid"))
    private List<BookMany> booksmany;

    public AuthorMany() {
    }


    public List<BookMany> getBooksmany() {
        return booksmany;
    }

    public void setBooksmany(List<BookMany> booksmany) {
        this.booksmany = booksmany;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AuthorAddressMany getAuthorAddressesMany() {
        return authorAddressesMany;
    }

    public void setAuthorAddressesMany(AuthorAddressMany authorAddressesMany) {
        this.authorAddressesMany = authorAddressesMany;
    }
}
