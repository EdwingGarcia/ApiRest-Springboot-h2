package com.apiRestProyecto;

import com.apiRestProyecto.modelo.Usuario;
import com.apiRestProyecto.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ServicioUsuario {
    @Autowired // sirve para inyectar a userService la variable
    private RepositorioUsuario repositorioUsuario;

    public Usuario crearUsuario(Usuario usuario){
        return repositorioUsuario.save(usuario);
    }


    public Usuario obtenerUsuarioID(Long id){
        Optional<Usuario> usuarioOpcional=repositorioUsuario.findById(id); //sirve para manejo de excepciones
        return usuarioOpcional.get();
    }

    public List<Usuario> obtenerTodosUsuarios(){
        return repositorioUsuario.findAll();
    }

    public void eliminarUsuario(Long id){
        repositorioUsuario.deleteById(id);
    }
}
