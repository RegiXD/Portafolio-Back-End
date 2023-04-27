package com.Portafolio.PortafolioBackend.Service;

import com.Portafolio.PortafolioBackend.Model.RedSocial;
import com.Portafolio.PortafolioBackend.Model.RedSocialdeUsuario;
import com.Portafolio.PortafolioBackend.Repository.RedSocialRepository;
import com.Portafolio.PortafolioBackend.Repository.RedSocialdeUsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class RedSocialService implements IRedSocialService{
    @Autowired
    private RedSocialdeUsuarioRepository rsur;
    
    @Autowired
    private RedSocialRepository rsr;  
    
    @Override
    public List<RedSocial> FindRedSocialById(Long id_Usuario) {
        List<RedSocialdeUsuario> aux = rsur.findByid_Usuario(id_Usuario);
        List<RedSocial> redes = new ArrayList<RedSocial>();
        for(RedSocialdeUsuario rsu:aux){
            Long id = rsu.getId_RedSocial();
            RedSocial rs  = rsr.findById(id);
            redes.add(rsr.findById(id));
        }
    }
    
}
