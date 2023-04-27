package com.Portafolio.PortafolioBackend.Controller;

import com.Portafolio.PortafolioBackend.Model.Usuario;
import com.Portafolio.PortafolioBackend.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private IUsuarioService us;
    
    @GetMapping("/usuario/buscar/{id}")
    @ResponseBody
    public Usuario FindUserById(@PathVariable Long id) {
        return us.FindUserById(id);
    }
    
    @PostMapping("/usuario/nuevo")
    public void AddUser(@RequestBody Usuario u) {
        us.AddUser(u);
    }
    
    @DeleteMapping("/usuario/borrar/{id}")
    public void DeleteUserById(@PathVariable Long id) {
        us.DeleteUserById(id);
    }
}
