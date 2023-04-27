package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.NiveldeHabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveldeHabilidadRepository extends JpaRepository<NiveldeHabilidad, Long>{
    
}
