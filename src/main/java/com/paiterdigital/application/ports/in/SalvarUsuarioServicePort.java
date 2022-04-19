package com.paiterdigital.application.ports.in;

import com.paiterdigital.application.core.domain.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvar(final Usuario usuario, final String cep);
}
