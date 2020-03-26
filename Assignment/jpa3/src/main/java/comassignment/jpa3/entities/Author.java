package comassignment.jpa3.entities;


import javax.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Author {
    @Id
    private Integer id;
    private  String name;
    private Integer age;

//    2.Create instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    AuthorAddress authorAddresses;

//    3.Introduce a List of subjects for author.
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Subjects> subjectsList;

    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    private Book books;

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public List<Subjects> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subjects> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public Author() {
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

    public AuthorAddress getAuthorAddresses() {
        return authorAddresses;
    }

    public void setAuthorAddresses(AuthorAddress authorAddresses) {
        this.authorAddresses = authorAddresses;
    }
}
