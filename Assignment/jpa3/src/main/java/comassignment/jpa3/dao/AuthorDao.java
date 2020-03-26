package comassignment.jpa3.dao;

import comassignment.jpa3.entities.Author;
import comassignment.jpa3.entities.AuthorAddress;
import comassignment.jpa3.entities.Book;
import comassignment.jpa3.manyToMany.AuthorAddressMany;
import comassignment.jpa3.manyToMany.AuthorMany;
import comassignment.jpa3.manyToMany.BookMany;
import comassignment.jpa3.oneToMany.AuthorAddressOne;
import comassignment.jpa3.oneToMany.AuthorOne;
import comassignment.jpa3.oneToMany.BookOne;
import comassignment.jpa3.repositories.AuthorManyRepository;
import comassignment.jpa3.repositories.AuthorOneRepository;
import comassignment.jpa3.repositories.AuthorRepository;
import comassignment.jpa3.entities.Subjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class AuthorDao {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    AuthorOneRepository authorOneRepository;

    @Autowired
    AuthorManyRepository authorManyRepository;

    public void addAuthor(){
        Author author=new Author();
        author.setId(1);
        author.setAge(21);
        author.setName("Auro");

        List<Subjects> subjectsList = new ArrayList<>();
        Subjects subjects= new Subjects();
        subjects.setAuthor(author);
        subjects.setId(1);
        subjects.setSubject1("Mathematics");
        subjects.setSubject2("Physics");
        subjects.setSubject3("Chemistry");
        subjectsList.add(subjects);
        author.setSubjectsList(subjectsList);

        Book book= new Book();
        book.setAuthor(author);
        book.setBookId(1);
        book.setBookName("The Professionala");
        author.setBooks(book);

        AuthorAddress authorAddress=new AuthorAddress();
        authorAddress.setLocation("Noida");
        authorAddress.setState("UP");
        authorAddress.setStreetNumber("11");
        author.setAuthorAddresses(authorAddress);

        authorRepository.save(author);
    }

    public void addAuthorOne(){
        AuthorOne authorOne= new AuthorOne();
        authorOne.setId(1);
        authorOne.setName("RD sharma");
        authorOne.setAge(6);

        List<BookOne> bookOneList= new ArrayList<>();
        BookOne bookOne= new BookOne();
        bookOne.setBookId(1);
        bookOne.setBookName("Mathematics vol.1");
        bookOne.setAuthorOne(authorOne);
        bookOneList.add(bookOne);

        BookOne bookOne1= new BookOne();
        bookOne1.setBookId(2);
        bookOne1.setBookName("Mathematics vol.2");
        bookOne1.setAuthorOne(authorOne);
        bookOneList.add(bookOne1);
        authorOne.setBooksOne(bookOneList);

        AuthorAddressOne authorAddressOne= new AuthorAddressOne();
        authorAddressOne.setStreetNumber("14 Cross Street");
        authorAddressOne.setLocation("Noida");
        authorAddressOne.setState("Uttar Pradesh");
        authorOne.setAuthorAddressesOne(authorAddressOne);

        authorOneRepository.save(authorOne);
    }
    public void addAuthorMany(){

        AuthorAddressMany authorAddressMany= new AuthorAddressMany();
        authorAddressMany.setStreetNumber("14 Arjuna Street");
        authorAddressMany.setLocation("Greater Noida");
        authorAddressMany.setState("Uttar Pradesh");

        AuthorMany authorMany= new AuthorMany();
        authorMany.setId(1);
        authorMany.setAge(21);
        authorMany.setName("Aradhya");
        authorMany.setAuthorAddressesMany(authorAddressMany);

        AuthorMany authorMany1= new AuthorMany();
        authorMany1.setId(2);
        authorMany1.setAge(21);
        authorMany1.setName("Aman");

        authorMany1.setAuthorAddressesMany(authorAddressMany);

        List<BookMany>  bookManyList = new ArrayList<>();
        BookMany bookMany= new BookMany();
        bookMany.setBookid(1);
        bookMany.setBookName("The Invisible Man");


        BookMany bookMany1= new BookMany();
        bookMany1.setBookid(2);
        bookMany1.setBookName("As You Like It");


        bookManyList.add(bookMany);
        bookManyList.add(bookMany1);

        authorMany.setBooksmany(bookManyList);
        authorMany1.setBooksmany(bookManyList);

        authorManyRepository.save(authorMany);
        authorManyRepository.save(authorMany1);

    }


}
