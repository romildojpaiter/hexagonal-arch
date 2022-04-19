package com.paiterdigital.adapters.outbound.rest;

import com.paiterdigital.application.core.domain.Endereco;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("ws")
@RegisterRestClient(baseUri = "https://viacep.com.br")
public interface BuscarEnderecoRest {

    @GET
    @Path("/{cep}/json")
    Endereco buscarEndereco(@PathParam("cep") final String cep) ;

}
