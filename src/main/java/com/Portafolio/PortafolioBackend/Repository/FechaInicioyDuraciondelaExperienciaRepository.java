package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.FechaInicioyDuracióndelaExperiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FechaInicioyDuraciondelaExperienciaRepository extends JpaRepository<FechaInicioyDuracióndelaExperiencia, Long>{
    
}
