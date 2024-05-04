package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuariosDao {

    //Aca estan todas las clases que hacen la conexion a la DB;
    //Cada classe respresentan una tabla de la DB

    List<Usuario> getUsuarios();


}
