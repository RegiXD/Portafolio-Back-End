package com.Portafolio.PortafolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name="fecha inicio y duración de la experiencia")
public class FechaInicioyDuracióndelaExperiencia {
    private Long id_Usuario;
    private String fechaInicio;
    private String duracion;
    private Long id_Experiencia;

    public FechaInicioyDuracióndelaExperiencia() {
    }

    public FechaInicioyDuracióndelaExperiencia(Long id_Usuario, String fechaInicio, String duracion, Long id_Experiencia) {
        this.id_Usuario = id_Usuario;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.id_Experiencia = id_Experiencia;
    }
    
}
