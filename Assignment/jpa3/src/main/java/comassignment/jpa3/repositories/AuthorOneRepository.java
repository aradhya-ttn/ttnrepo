package comassignment.jpa3.repositories;

import comassignment.jpa3.oneToMany.AuthorOne;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneRepository extends CrudRepository<AuthorOne,Integer> {

}
