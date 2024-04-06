package com.apiRestProyecto.controlador;

import com.apiRestProyecto.ServicioUsuario;
import com.apiRestProyecto.modelo.Usuario;
import com.oracle.svm.core.annotate.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //convierto mi clase para exponer los endpoints que puedan ser consumidos
@RequestMapping("api/usuarios") //ruta de Endpoints
public class ControladorUsuario {
@Autowired
    private ServicioUsuario servicioUsuario;
    @PostMapping //metodo de apirest
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return servicioUsuario.crearUsuario(usuario);
    }
    @GetMapping
    public List<Usuario> obtenerUsuarios(){
        return servicioUsuario.obtenerTodosUsuarios();
    }
    @GetMapping("{id}")
    public Usuario buscarUsuarioID(@PathVariable("id") Long id){ //lo que venga desde el cliente
        return servicioUsuario.obtenerUsuarioID(id);
    }
    @DeleteMapping("{id}")
    public void  eliminarUsuarioID(@PathVariable("id") Long id){ //lo que venga desde el cliente
         servicioUsuario.eliminarUsuario(id);
    }
}
