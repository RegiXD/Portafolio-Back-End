package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Long>{
    
}
