package br.com.projeto.api.entity;
import lombok.Data;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.*;

@Data
@Entity
@Table(name = "enderecos",uniqueConstraints = { @UniqueConstraint(columnNames = { "isMain", "person_id" }) })
public class Endereco {
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

private Boolean isMain;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore Person person;
   
}
