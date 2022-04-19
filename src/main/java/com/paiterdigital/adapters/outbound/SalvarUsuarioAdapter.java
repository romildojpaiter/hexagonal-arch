package com.paiterdigital.adapters.outbound;

import com.paiterdigital.adapters.inbound.mapper.EnderecoMapper;
import com.paiterdigital.adapters.inbound.mapper.UsuarioMapper;
import com.paiterdigital.adapters.outbound.repository.UsuarioRepository;
import com.paiterdigital.application.core.domain.Usuario;
import com.paiterdigital.application.ports.out.SalvarUsuarioPort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    @Inject
    private UsuarioRepository usuarioRepository;

    @Inject
    private EnderecoMapper enderecoMapper;

    @Inject
    private UsuarioMapper usuarioMapper;


    @Override
    @Transactional
    public Usuario salvar(final Usuario usuario) {
        var usuarioEntity = usuarioMapper.toEntity(usuario);
        var enderecoEntity = enderecoMapper.toEntity(usuario.getEndereco());

        usuarioEntity.setEndereco(enderecoEntity);
        usuarioRepository.persist(usuarioEntity);
        return usuarioMapper.toDomain(usuarioEntity);
    }
}
