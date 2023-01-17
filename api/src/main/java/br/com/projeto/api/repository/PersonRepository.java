package br.com.projeto.api.repository;
import br.com.projeto.api.entity.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "persons", collectionResourceRel = "persons")
public interface PersonRepository extends CrudRepository<Person, Long> {

}
