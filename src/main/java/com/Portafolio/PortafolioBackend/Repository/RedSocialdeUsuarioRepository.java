package com.Portafolio.PortafolioBackend.Repository;

import com.Portafolio.PortafolioBackend.Model.RedSocialdeUsuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialdeUsuarioRepository extends JpaRepository<RedSocialdeUsuario, Long>{    
    public List<RedSocialdeUsuario> findByid_Usuario(Long id_Usuario);
}
