package comassignment.jpa3.repositories;

import comassignment.jpa3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
