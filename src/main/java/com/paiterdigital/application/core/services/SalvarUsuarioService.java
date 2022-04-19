package com.paiterdigital.application.core.services;

import com.paiterdigital.application.core.domain.Usuario;
import com.paiterdigital.application.ports.in.SalvarUsuarioServicePort;
import com.paiterdigital.application.ports.out.BuscarEnderecoPort;
import com.paiterdigital.application.ports.out.SalvarUsuarioPort;

/**
 * Classe agnostica a framework
 */
public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private SalvarUsuarioPort salvarUsuarioPort;
    private BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvar(Usuario usuario, String cep) {
        var endereco =buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);
        return salvarUsuarioPort.salvar(usuario);
    }

}
