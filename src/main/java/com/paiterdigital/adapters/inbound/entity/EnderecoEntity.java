package com.paiterdigital.adapters.inbound.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enderecos")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    private String cep;
    private String logradouro;
    private String uf;
    private String cidade;


}
