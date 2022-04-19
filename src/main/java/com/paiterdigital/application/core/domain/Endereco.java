package com.paiterdigital.application.core.domain;

import lombok.Data;

@Data
public class Endereco {

    private String cep;
    private String logradouro;
    private String uf;
    private String localidade;

}
