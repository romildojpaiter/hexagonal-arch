package com.paiterdigital.config;

import com.paiterdigital.application.core.services.SalvarUsuarioService;
import com.paiterdigital.application.ports.out.BuscarEnderecoPort;
import com.paiterdigital.application.ports.out.SalvarUsuarioPort;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;

@Dependent
public class Config {

    @Default
    public SalvarUsuarioService salvarUsuarioService(final SalvarUsuarioPort salvarUsuarioPort, final BuscarEnderecoPort buscarEnderecoPort) {
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }
}
