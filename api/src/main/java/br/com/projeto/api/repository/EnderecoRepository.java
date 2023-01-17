package br.com.projeto.api.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import br.com.projeto.api.entity.Endereco;

@RepositoryRestResource(path = "enderecos", collectionResourceRel = "enderecos")
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

}

