package com.paiterdigital.application.ports.out;

import com.paiterdigital.application.core.domain.Endereco;

public interface BuscarEnderecoPort {

    Endereco buscar(final String cep);
}
