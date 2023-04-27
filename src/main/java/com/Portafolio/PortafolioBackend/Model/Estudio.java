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
@Table(name="estudio")
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Estudio;
    private String instituto;
    private String curso;

    public Estudio() {
    }

    public Estudio(String instituto, String curso) {
        this.instituto = instituto;
        this.curso = curso;
    }

}
