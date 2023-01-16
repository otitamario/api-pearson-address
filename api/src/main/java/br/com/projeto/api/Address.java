package br.com.projeto.api;

import lombok.Data;
import javax.persistence.*;
import jakarta.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String logradouro;
     @NotNull
    private String cep;
     @NotNull
    private long numero;
    @NotNull
    private String cidade;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
   

}
