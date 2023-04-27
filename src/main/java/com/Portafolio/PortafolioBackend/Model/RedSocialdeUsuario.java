package com.Portafolio.PortafolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name="red social de usuario")
public class RedSocialdeUsuario {
    private Long id_Usuario;
    private Long id_RedSocial;

    public RedSocialdeUsuario() {
    }

    public RedSocialdeUsuario(Long id_Usuario, Long id_RedSocial) {
        this.id_Usuario = id_Usuario;
        this.id_RedSocial = id_RedSocial;
    }
    
}
