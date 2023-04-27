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
@Table(name="red social")
public class RedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_RedSocial;
    private String nombre;
    private String logo;
    private String color;

    public RedSocial() {
    }

    public RedSocial(String nombre, String logo, String color) {
        this.nombre = nombre;
        this.logo = logo;
        this.color = color;
    }
    
}
