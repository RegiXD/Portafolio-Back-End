package com.Portafolio.PortafolioBackend.Service;

import com.Portafolio.PortafolioBackend.Model.Usuario;
import com.Portafolio.PortafolioBackend.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository ur;
    
    @Override
    public void AddUser(Usuario u) {
        ur.save(u);
    }

    @Override
    public void DeleteUserById(Long Id_Usuario) {
        ur.deleteById(Id_Usuario);
    }

    @Override
    public Usuario FindUserById(Long id_Usuario) {
        return ur.findById(id_Usuario).orElse(null);
    }
}
