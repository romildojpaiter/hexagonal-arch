package com.paiterdigital.adapters.inbound.mapper;

import com.paiterdigital.adapters.inbound.entity.EnderecoEntity;
import com.paiterdigital.application.core.domain.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "cdi", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper {

    @Mapping(source = "logradouro", target = "cidade")
    EnderecoEntity toEntity(Endereco endereco);

}
