package com.paiterdigital.adapters.outbound.repository;

import com.paiterdigital.adapters.inbound.entity.UsuarioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<UsuarioEntity> {
}
