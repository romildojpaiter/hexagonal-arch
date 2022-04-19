package com.paiterdigital.application.ports.out;

import com.paiterdigital.application.core.domain.Usuario;

public interface SalvarUsuarioPort {

    Usuario salvar(final Usuario usuario);

}
