package comassignment.jpa3.repositories;

import comassignment.jpa3.manyToMany.AuthorMany;
import org.springframework.data.repository.CrudRepository;

public interface AuthorManyRepository extends CrudRepository<AuthorMany,Integer> {


}
