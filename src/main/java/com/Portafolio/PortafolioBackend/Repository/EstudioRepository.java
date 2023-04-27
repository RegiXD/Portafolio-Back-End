package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long>{
    
}