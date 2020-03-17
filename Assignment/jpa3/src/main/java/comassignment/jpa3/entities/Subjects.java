package comassignment.jpa3.entities;

import javax.persistence.*;

@Entity
public class Subjects {

    @Id
    private Integer id;

//    4.Persist 3 subjects for each author.

    private  String subject1;
    private String subject2;
    private String subject3;

    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }




    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

}
