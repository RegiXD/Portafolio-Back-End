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
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Usuario;
    
    private String nombre;
    private String apellido;
    private Long telefono;
    private String email;
    private String profecion;
    private String biografia;
    private String foto;
    private String clave;
    private String usuario;

    public Usuario() {
    }

    public Usuario(Long telefono, String biografia, String nombre, String apellido, String email, String profecion, String foto, String clave, String usuario) {
        this.telefono = telefono;
        this.biografia = biografia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.profecion = profecion;
        this.foto = foto;
        this.clave = clave;
        this.usuario = usuario;
    }
}
