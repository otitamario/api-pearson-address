package br.com.projeto.api;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.domain.Sort;


@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
	List<Address> findByPerson(Person person, Sort sort);

}

