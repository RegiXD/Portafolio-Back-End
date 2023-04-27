package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial, Long>{
    
}
