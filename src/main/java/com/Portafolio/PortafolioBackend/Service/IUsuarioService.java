package com.Portafolio.PortafolioBackend.Service;

import com.Portafolio.PortafolioBackend.Model.Usuario;

public interface IUsuarioService {
    public void AddUser(Usuario u);
    public void DeleteUserById(Long Id_Usuario);
    public Usuario FindUserById(Long id_Usuario);
}
