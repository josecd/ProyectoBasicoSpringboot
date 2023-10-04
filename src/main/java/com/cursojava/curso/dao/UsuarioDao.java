package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void registrar(Usuario usuario);

    void eliminar(Long id);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
