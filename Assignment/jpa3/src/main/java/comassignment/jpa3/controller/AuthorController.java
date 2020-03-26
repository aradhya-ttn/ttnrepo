package comassignment.jpa3.controller;

import comassignment.jpa3.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {


    @Autowired
    AuthorDao authorDao;

//    6.Implement One to One mapping between Author and Book.
    @GetMapping("/authors/onetoone")
    public void getAuhtor(){
        authorDao.addAuthor();
    }

//    7.Implement One to Many Mapping between Author and Book(Unidirectional,
//    BiDirectional and without additional table ) and implement cascade save.
    @GetMapping("/authors/onetomany")
    public void getAuthorOne(){
        authorDao.addAuthorOne();
    }
//   8.Implement Many to Many Mapping between Author and Book.
    @GetMapping("/authors/manytomany")
    public void getAuthorMany(){
        authorDao.addAuthorMany();
    }
//9.Which method on the session object can be used to remove an object from the cache?
//    Ans: evict() is used to remove a particular object from cache associated with session
//     and clear() method is used to remove all cached objects associated with session

//    10.What does @transactional annotation do?
//    Ans:Any Entity Manager inside a @Transactional method will run in a single database transaction.
//      The transactional annotation itself defines the scope of a single database transaction

}
