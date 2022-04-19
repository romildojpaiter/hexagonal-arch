package com.paiterdigital.adapters.inbound.mapper;

import com.paiterdigital.adapters.inbound.request.UsuarioRequest;
import com.paiterdigital.application.core.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "cdi", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioRequestMapper {

    @Mapping(source = "cep", target = "endereco.cep")
    Usuario toDomain(UsuarioRequest usuarioRequest);

}
