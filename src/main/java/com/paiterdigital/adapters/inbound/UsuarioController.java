package com.paiterdigital.adapters.inbound;

import com.paiterdigital.adapters.inbound.mapper.UsuarioRequestMapper;
import com.paiterdigital.adapters.inbound.request.UsuarioRequest;
import com.paiterdigital.application.core.domain.Usuario;
import com.paiterdigital.application.ports.in.SalvarUsuarioServicePort;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @Inject
    private SalvarUsuarioServicePort salvarUsuarioServicePort;

    @Inject
    private UsuarioRequestMapper usuarioRequestMapper;


    @POST
    public Usuario salvarUsuario(final UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestMapper.toDomain(usuarioRequest);
        return salvarUsuarioServicePort.salvar(usuario, usuarioRequest.getCep());
    }

}
