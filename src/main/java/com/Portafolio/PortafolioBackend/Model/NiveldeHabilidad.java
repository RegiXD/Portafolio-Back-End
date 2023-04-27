package com.Portafolio.PortafolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name="nivel de habilidad")
public class NiveldeHabilidad {
    private Long id_Usuario;
    private int nivel;
    private Long id_Habilidad;

    public NiveldeHabilidad() {
    }

    public NiveldeHabilidad(Long id_Usuario, int nivel, Long id_Habilidad) {
        this.id_Usuario = id_Usuario;
        this.nivel = nivel;
        this.id_Habilidad = id_Habilidad;
    }
}
