package comassignment.jpa3.oneToMany;


import comassignment.jpa3.entities.AuthorAddress;
import comassignment.jpa3.entities.Book;
import comassignment.jpa3.entities.Subjects;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class AuthorOne {
    @Id
    private Integer id;
    private  String name;
    private Integer age;

    @Embedded
    AuthorAddressOne authorAddressesOne;


    @OneToMany(mappedBy = "authorOne",cascade = CascadeType.ALL)
    private List<BookOne> booksOne;

    public AuthorOne() {
    }

    public List<BookOne> getBooksOne() {
        return booksOne;
    }

    public void setBooksOne(List<BookOne> booksOne) {
        this.booksOne = booksOne;
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

    public AuthorAddressOne getAuthorAddressesOne() {
        return authorAddressesOne;
    }

    public void setAuthorAddressesOne(AuthorAddressOne authorAddressesOne) {
        this.authorAddressesOne = authorAddressesOne;
    }
}
