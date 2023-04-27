package com.Portafolio.PortafolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name="último año de estudio")
public class ÚltimoAñodeEstudio {
    private Long id_Usuario;
    private String fecha;
    private String descripcion;
    private Long id_Estudio;

    public ÚltimoAñodeEstudio() {
    }

    public ÚltimoAñodeEstudio(Long id_Usuario, String fecha, String descripcion, Long id_Estudio) {
        this.id_Usuario = id_Usuario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.id_Estudio = id_Estudio;
    }
    
}
