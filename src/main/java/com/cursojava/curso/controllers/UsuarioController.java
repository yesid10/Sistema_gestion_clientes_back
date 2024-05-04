package com.cursojava.curso.controllers;


import com.cursojava.curso.dao.UsuariosDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuariosDao usuariosDao;

    @CrossOrigin(origins = "http://localhost:3000") // Reemplaza esto con la URL de tu frontend
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Yesid");
        usuario.setApellido("Vanegas");
        usuario.setEmail("yesidvanegas68@gmail.com");
        usuario.setTelefono("3118599554");

        return usuario;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuariosDao.getUsuarios();
    }

    @RequestMapping(value = "usuario7")
    public Usuario editUsuario(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Yesid");
        usuario.setApellido("Vanegas");
        usuario.setEmail("yesidvanegas68@gmail.com");
        usuario.setTelefono("3118599554");

        return usuario;
    }

    @RequestMapping(value = "usuario8")
    public Usuario deleteUsuario(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Yesid");
        usuario.setApellido("Vanegas");
        usuario.setEmail("yesidvanegas68@gmail.com");
        usuario.setTelefono("3118599554");

        return usuario;
    }

    @RequestMapping(value = "usuario9")
    public Usuario searchUsuario(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Yesid");
        usuario.setApellido("Vanegas");
        usuario.setEmail("yesidvanegas68@gmail.com");
        usuario.setTelefono("3118599554");

        return usuario;
    }
}
