package br.com.projeto.api;
import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotNull
    private String nome;
    @NotNull
    private LocalDate nascimento;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Address> addresses;


}
