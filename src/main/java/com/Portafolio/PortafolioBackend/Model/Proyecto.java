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
@Table(name="proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Proyecto;
    private String nombre;
    private String descripcion;
    private String link;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String link) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
    }
    
}
