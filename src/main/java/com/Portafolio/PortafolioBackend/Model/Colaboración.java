package com.Portafolio.PortafolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name="colaboración")
public class Colaboración {
    private Long id_Proyecto;
    private Long id_Usuario;

    public Colaboración() {
    }

    public Colaboración(Long id_Proyecto, Long id_Usuario) {
        this.id_Proyecto = id_Proyecto;
        this.id_Usuario = id_Usuario;
    }
}
