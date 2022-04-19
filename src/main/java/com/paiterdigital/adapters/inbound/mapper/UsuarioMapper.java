package com.paiterdigital.adapters.inbound.mapper;

import com.paiterdigital.adapters.inbound.entity.UsuarioEntity;
import com.paiterdigital.application.core.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "cdi", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper {

    UsuarioEntity toEntity(final Usuario usuario);

    @Mapping(source = "endereco.cidade", target = "endereco.localidade")
    Usuario toDomain(final UsuarioEntity usuarioEntity);

}
