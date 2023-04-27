package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.ÚltimoAñodeEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UltimoAñodeEstudioRepository extends JpaRepository<ÚltimoAñodeEstudio, Long>{
    
}
