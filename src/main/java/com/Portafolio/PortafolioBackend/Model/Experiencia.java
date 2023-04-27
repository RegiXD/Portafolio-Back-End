package com.Portafolio.PortafolioBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name="experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Experiencia;
    private String empresa;
    private String cargo;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(String empresa, String cargo, String descripcion) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.descripcion = descripcion;
    }
    
}
