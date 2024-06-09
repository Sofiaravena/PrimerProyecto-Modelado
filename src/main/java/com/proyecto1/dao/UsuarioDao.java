package com.proyecto1.dao;

import java.util.List;

import com.proyecto1.modelo.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {
	
	List<Usuario> obtenerUsuarios();

}
