package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

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
        List<Usuario> arrayUsuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Yesid");
        usuario.setApellido("Vanegas");
        usuario.setEmail("yesidvanegas68@gmail.com");
        usuario.setTelefono("3118599554");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Melisa");
        usuario2.setApellido("Alejandra");
        usuario2.setEmail("melisa68@gmail.com");
        usuario2.setTelefono("3118599554");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Yesid");
        usuario3.setApellido("Vanegas");
        usuario3.setEmail("yesidvanegas68@gmail.com");
        usuario3.setTelefono("3118599554");

        Usuario usuario5 = new Usuario();
        usuario5.setId(4L);
        usuario5.setNombre("Yesid");
        usuario5.setApellido("Vanegas");
        usuario5.setEmail("yesidvanegas68@gmail.com");
        usuario5.setTelefono("3118599554");

        Usuario usuario6 = new Usuario();
        usuario6.setId(5L);
        usuario6.setNombre("Yesid");
        usuario6.setApellido("Vanegas");
        usuario6.setEmail("yesidvanegas68@gmail.com");
        usuario6.setTelefono("3118599554");

        arrayUsuarios.add(usuario);
        arrayUsuarios.add(usuario2);
        arrayUsuarios.add(usuario3);
        arrayUsuarios.add(usuario5);
        arrayUsuarios.add(usuario6);
        return arrayUsuarios;
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
