package com.paiterdigital.adapters.outbound;

import com.paiterdigital.adapters.outbound.rest.BuscarEnderecoRest;
import com.paiterdigital.application.core.domain.Endereco;
import com.paiterdigital.application.ports.out.BuscarEnderecoPort;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    @Inject
    @RestClient
    BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(final String cep) {
        return buscarEnderecoRest.buscarEndereco(cep);
    }
}
